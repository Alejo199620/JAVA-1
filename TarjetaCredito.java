/**
 * Class TarjetaCredito
 */
public class TarjetaCredito {

    //
    // Fields
    //

    private String numero;
    private String titular;
    private String codigoSeguridad;

    //
    // Constructors
    //
    public TarjetaCredito(String numero, String titular, String codigoSeguridad) {
        this.numero = numero;
        this.titular = titular;
        this.codigoSeguridad = codigoSeguridad;
    }

    //
    // Methods
    //

    //
    // Accessor methods
    //

    /**
     * Set the value of numero
     *
     * @param newVar the new value of numero
     */
    public void setNumero(String newVar) {
        numero = newVar;
    }

    /**
     * Get the value of numero
     *
     * @return the value of numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Set the value of titular
     *
     * @param newVar the new value of titular
     */
    public void setTitular(String newVar) {
        titular = newVar;
    }

    /**
     * Get the value of titular
     *
     * @return the value of titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Set the value of codigoSeguridad
     *
     * @param newVar the new value of codigoSeguridad
     */
    public void setCodigoSeguridad(String newVar) {
        codigoSeguridad = newVar;
    }

    /**
     * Get the value of codigoSeguridad
     *
     * @return the value of codigoSeguridad
     */
    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    //
    // Other methods
    //

}