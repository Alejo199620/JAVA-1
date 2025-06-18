/**
 * Class Representante
 */
public class Representante {

    //
    // Fields
    //

    private String id;
    private String nombre;

    public SistemaCredito m_credito;

    //
    // Constructors
    //
    public Representante(String id, String nombre, SistemaCredito credito) {
        this.id = id;
        this.nombre = nombre;
        this.m_credito = credito;
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

    //
    // Other methods
    //

    /**
     */
    public void revisarSolicitud() {
        System.out.println("Revisando historial crediticio del cliente...");
    }

    public void aprobarCredito() {
        System.out.println("Crédito aprobado con éxito.");
    }

    /**
     */
    public void rechazarCredito() {
        System.out.println("Crédito rechazado.");
    }

}
