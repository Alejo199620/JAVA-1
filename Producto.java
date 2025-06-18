/**
 * Class Producto
 */
public class Producto {

    //
    // Fields
    //

    private String codigo;
    private String descripcion;
    private double precio;
    private int stock;

    //
    // Constructors
    //
    public Producto(String codigo, String descripcion, double precio, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    //
    // Methods
    //

    //
    // Accessor methods
    //

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
     * Set the value of descripcion
     *
     * @param newVar the new value of descripcion
     */
    public void setDescripcion(String newVar) {
        descripcion = newVar;
    }

    /**
     * Get the value of descripcion
     *
     * @return the value of descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Set the value of precio
     *
     * @param newVar the new value of precio
     */
    public void setPrecio(double newVar) {
        precio = newVar;
    }

    /**
     * Get the value of precio
     *
     * @return the value of precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Set the value of stock
     *
     * @param newVar the new value of stock
     */
    public void setStock(int newVar) {
        stock = newVar;
    }

    /**
     * Get the value of stock
     *
     * @return the value of stock
     */
    public int getStock() {
        return stock;
    }

    //
    // Other methods
    //

}