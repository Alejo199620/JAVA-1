import java.util.Date;
/**
 * Class Compra
 */
public class Compra {

    //
    // Fields
    //

    public String producto;
    public double total;
    private String estado;
    private Date fecha;

    public Vendedor m_vendedor;

    public Cliente m_cliente;

    public Compra m_venta;

    //
    // Constructors
    //
    public Compra(String producto, double total, String estado, Date fecha, Vendedor vendedor, Cliente cliente) {
        this.producto = producto;
        this.total = total;
        this.estado = estado;
        this.fecha = fecha;
        this.m_vendedor = vendedor;
        this.m_cliente = cliente;
        this.m_venta = null;
    }

    //
    // Methods
    //

    //
    // Accessor methods
    //

    /**
     * Set the value of producto
     *
     * @param newVar the new value of producto
     */
    public void setProducto(String newVar) {
        producto = newVar;
    }

    /**
     * Get the value of producto
     *
     * @return the value of producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Set the value of total
     *
     * @param newVar the new value of total
     */
    public void setTotal(double newVar) {
        total = newVar;
    }

    /**
     * Get the value of total
     *
     * @return the value of total
     */
    public double getTotal() {
        return total;
    }

    /**
     * Set the value of estado
     *
     * @param newVar the new value of estado
     */
    public void setEstado(String newVar) {
        estado = newVar;
    }

    /**
     * Get the value of estado
     *
     * @return the value of estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Set the value of fecha
     *
     * @param newVar the new value of fecha
     */
    public void setFecha(Date newVar) {
        fecha = newVar;
    }

    /**
     * Get the value of fecha
     *
     * @return the value of fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Set the value of m_vendedor
     *
     * @param newVar the new value of m_vendedor
     */
    public void setVendedor(Vendedor newVar) {
        m_vendedor = newVar;
    }

    /**
     * Get the value of m_vendedor
     *
     * @return the value of m_vendedor
     */
    public Vendedor getVendedor() {
        return m_vendedor;
    }

    /**
     * Set the value of m_cliente
     *
     * @param newVar the new value of m_cliente
     */
    public void setCliente(Cliente newVar) {
        m_cliente = newVar;
    }

    /**
     * Get the value of m_cliente
     *
     * @return the value of m_cliente
     */
    public Cliente getCliente() {
        return m_cliente;
    }

    //
    // Other methods
    //

    /**
     */
    public void calcularTotal() {
    }

}

