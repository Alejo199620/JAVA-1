/**
 * Class Cliente
 */
public class Cliente {

    //
    // Fields
    //

    public String nombre;
    public String direccion;
    private String id;
    private String telefono;
    private String email;

    public SistemaCredito m_credito;

    public Cliente m_cliente;

    public Compra m_venta;

    //
    // Constructors
    //
    public Cliente() {
    };

    public Cliente(String nombre, String direccion, String id, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.id = id;
        this.telefono = telefono;
        this.email = email;
        this.m_credito = null;
        this.m_cliente = null;
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
     * Set the value of direccion
     *
     * @param newVar the new value of direccion
     */
    public void setDireccion(String newVar) {
        direccion = newVar;
    }

    /**
     * Get the value of direccion
     *
     * @return the value of direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Set the value of id
     *
     * @param newVar the new value of id
     */
    public void setId(String newVar) {
        id = newVar;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Set the value of telefono
     *
     * @param newVar the new value of telefono
     */
    public void setTelefono(String newVar) {
        telefono = newVar;
    }

    /**
     * Get the value of telefono
     *
     * @return the value of telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Set the value of email
     *
     * @param newVar the new value of email
     */
    public void setEmail(String newVar) {
        email = newVar;
    }

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of m_credito
     *
     * @param newVar the new value of m_credito
     */
    public void setCredito(SistemaCredito newVar) {
        m_credito = newVar;
    }

    /**
     * Get the value of m_credito
     *
     * @return the value of m_credito
     */
    public SistemaCredito getCredito() {
        return m_credito;
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
    public void solicitarCredito() {
        System.out.println("Cliente " + nombre + " solicita crédito para su compra");
    }

    /**
     */
    public void proporcionaDatosTarjeta() {
        System.out.println("Cliente " + nombre + " ha proporcionado datos de tarjeta.");
    }

    /**
     */
    public void new_operation() {
    }

}
