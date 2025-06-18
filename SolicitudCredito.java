/**
 * Class SolicitudCredito
 */
public class SolicitudCredito {

    //
    // Fields
    //

    private String id;
    private String estado;
    private double monto;
    private int cuotas;

    //
    // Constructors
    //
    public SolicitudCredito(String id, String estado, double monto, int cuotas) {
        this.id = id;
        this.estado = estado;
        this.monto = monto;
        this.cuotas = cuotas;
    }
    //
    // Methods
    //

    //
    // Accessor methods
    //

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
     * Set the value of monto
     *
     * @param newVar the new value of monto
     */
    public void setMonto(double newVar) {
        monto = newVar;
    }

    /**
     * Get the value of monto
     *
     * @return the value of monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Set the value of cuotas
     *
     * @param newVar the new value of cuotas
     */
    public void setCuotas(int newVar) {
        cuotas = newVar;
    }

    /**
     * Get the value of cuotas
     *
     * @return the value of cuotas
     */
    public int getCuotas() {
        return cuotas;
    }

    //
    // Other methods
    //

    /**
     */
    public void evaluarSolicitud() {
        System.out.println("Evaluando solicitud de crédito...");
    }

}