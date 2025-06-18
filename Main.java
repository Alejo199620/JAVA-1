import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE CRÉDITO ELECTRÓNICA ARMSTRONG ===");
        
        // Producto predefinido
        Producto producto = new Producto("PROD001", "Televisor LED 55\" 4K", 1250.000, 10);
        
        // Vendedor predefinido
        Vendedor vendedor = new Vendedor("Carlos Martínez", "VEND2023");
        
        // Crear representante de créditos
        SistemaCredito sistemaCredito = new SistemaCredito(null, null, null);
        SistemaPago sistemaPago = new SistemaPago(sistemaCredito);
        Representante representante = new Representante("REP001", "Ana López", sistemaCredito);
        sistemaCredito.setRepresentante(representante);
        sistemaCredito.setSistemaPago(sistemaPago);
        
        // Mostrar información del vendedor y producto
        System.out.println("\nVendedor asignado: " + vendedor.getNombre());
        System.out.println("Código de vendedor: " + vendedor.getCodigo());
        System.out.println("\nInformación del producto :");
        System.out.println("Código: " + producto.getCodigo());
        System.out.println("Descripción: " + producto.getDescripcion());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Stock disponible: " + producto.getStock());
        
        // Registrar cliente
        System.out.println("\n=== REGISTRO DE CLIENTE ===");
        System.out.print("Nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionCliente = scanner.nextLine();
        System.out.print("ID: ");
        String idCliente = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoCliente = scanner.nextLine();
        System.out.print("Email: ");
        String emailCliente = scanner.nextLine();
        
        Cliente cliente = new Cliente(nombreCliente, direccionCliente, idCliente, telefonoCliente, emailCliente);
        
        // Registrar compra con producto predefinido
        System.out.println("\n=== REGISTRO DE COMPRA ===");
        System.out.println("Producto seleccionado automáticamente: " + producto.getDescripcion());
        System.out.println("Precio fijo: $" + producto.getPrecio());
        
        Date fechaCompra = new Date();
        Compra compra = new Compra(producto.getDescripcion(), producto.getPrecio(), "Pendiente",  fechaCompra, vendedor, cliente);
        vendedor.setVenta(compra);
        cliente.setVenta(compra);
        
        System.out.println("\nCompra registrada exitosamente:");
        System.out.println("Vendedor: " + vendedor.getNombre());
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Producto: " + compra.getProducto());
        System.out.println("Total: $" + compra.getTotal());
        
        // Consultar crédito
        System.out.print("\n¿El cliente desea solicitar crédito? (s/n): ");
        String respuesta = scanner.nextLine();
        
        if (respuesta.equalsIgnoreCase("s")) {
            // Solicitar datos de tarjeta
            System.out.println("\n=== SOLICITUD DE CRÉDITO ===");
            System.out.print("Número de tarjeta: ");
            String numTarjeta = scanner.nextLine();
            System.out.print("Titular de la tarjeta: ");
            String titularTarjeta = scanner.nextLine();
            System.out.print("Código de seguridad: ");
            String codigoSeguridad = scanner.nextLine();
            System.out.print("Número de cuotas (3, 6 o 12): ");
            int cuotas = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            TarjetaCredito tarjeta = new TarjetaCredito(numTarjeta, titularTarjeta, codigoSeguridad);
            SolicitudCredito solicitud = new SolicitudCredito("SOL" + System.currentTimeMillis(), "Pendiente",  compra.getTotal(), cuotas);
            
            // Proceso de solicitud
            System.out.println("\nProcesando solicitud de crédito...");
            cliente.solicitarCredito();
            cliente.proporcionaDatosTarjeta();
            vendedor.enviarSolicitudCredito();
            
            // Revisión del representante
            System.out.println("\n=== REVISIÓN DE CRÉDITO ===");
            representante.revisarSolicitud();
            
            // Decisión del usuario
            System.out.print("¿Aprobar crédito? (s/n): ");
            String decision = scanner.nextLine();
            
            if (decision.equalsIgnoreCase("s")) {
                representante.aprobarCredito();
                solicitud.setEstado("Aprobado");
                
                // Programar débitos
                System.out.println("\n=== PROGRAMACIÓN DE PAGOS ===");
                sistemaCredito.programarDebito();
                sistemaPago.verificarFondos();
                
                // Entregar producto
                System.out.println("\n=== ENTREGA DE PRODUCTO ===");
                vendedor.entregarProducto();
                
                // Simular cobro mensual
                System.out.println("\n=== PROCESO DE COBRO MENSUAL ===");
                System.out.println("Plan de pagos: " + cuotas + " cuotas de $" + (compra.getTotal()/cuotas));
                System.out.println("Primer pago programado para 30 días... Por un valor de $" + (compra.getTotal()/cuotas));
                sistemaPago.procesarDebito();
                sistemaCredito.realizarCobroMensual();
                
                System.out.println("\n¡Proceso completado con éxito! Producto entregado y crédito activado.");
            } else {
                solicitud.setEstado("Rechazado");
                System.out.println("\nCrédito rechazado. Venta cancelada o debe pagarse de contado.");
            }
        } else {
            System.out.println("Venta registrada como pago de contado.");
            System.out.println("Producto entregado al cliente.");
            vendedor.entregarProducto();
        }
        
        scanner.close();
    }
}
