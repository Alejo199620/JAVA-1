/**
 * Class Vendedor
 */
public class Vendedor {

    //
    // Fields
    //

    public String nombre;
    private String codigo;

    public Compra m_venta;

    //
    // Constructors
    //
    public Vendedor(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.m_venta = null;
    }

    //
    // Methods
    //

    //
    // Accessor methods
    //

    /**
     * Set the value of nombre
     *
     * @param newVar the new value of nombre
     */
    public void setNombre(String newVar) {
        nombre = newVar;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of codigo
     *
     * @param newVar the new value of codigo
     */
    public void setCodigo(String newVar) {
        codigo = newVar;
    }

    /**
     * Get the value of codigo
     *
     * @return the value of codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Set the value of m_venta
     *
     * @param newVar the new value of m_venta
     */
    public void setVenta(Compra newVar) {
        m_venta = newVar;
    }

    /**
     * Get the value of m_venta
     *
     * @return the value of m_venta
     */
    public Compra getVenta() {
        return m_venta;
    }

    //
    // Other methods
    //

    /**
     */
    public void registrarCompra() {
        System.out.println("Vendedor " + nombre + " registra compra en el sistema");
    }

    /**
     */
    public void enviarSolicitudCredito() {
        if (m_venta != null) {
            System.out.println("Solicitando crédito para el cliente: " + m_venta.getCliente().getNombre());
        } else {
            System.out.println("Error: No hay venta registrada.");
        }
    }

    /**
     */
    public void entregarProducto() {
        System.out.println("Vendedor " + nombre + " entrega producto al cliente");
    }

    /**
     */
    public void consultarCredito() {
        System.out.println("Consultando estado de crédito del cliente...");
    }

}