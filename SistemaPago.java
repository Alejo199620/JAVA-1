/**
 * Class SistemaPago
 */
public class SistemaPago {

    //
    // Fields
    //

    public SistemaCredito m_credito;

    //
    // Constructors
    //
    public SistemaPago(SistemaCredito credito) {
        this.m_credito = credito;
    }

    //
    // Methods
    //

    //
    // Accessor methods
    //

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
    public void procesarDebito() {
        System.out.println("Procesando débito en tarjeta del cliente...");
    }

    /**
     */
    public void verificarFondos() {
        System.out.println("Verificando fondos disponibles en tarjeta...");
    }

}
