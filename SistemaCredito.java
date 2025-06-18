    /**
     * Class SistemaCredito
     */
    public class SistemaCredito {

        //
        // Fields
        //

        public Cliente m_cliente;
        public Representante m_representante;
       
        public SistemaPago m_sistemaPago;

        //
        // Constructors
        //
        public SistemaCredito(Cliente cliente, Representante representante, SistemaPago sistemaPago) {
            this.m_cliente = cliente;
            this.m_representante = representante;
            this.m_sistemaPago = sistemaPago;
           
        }

        //
        // Methods
        //

        //
        // Accessor methods
        //

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

        /**
         * Set the value of m_representante
         *
         * @param newVar the new value of m_representante
         */
        public void setRepresentante(Representante newVar) {
            m_representante = newVar;
        }

        /**
         * Get the value of m_representante
         *
         * @return the value of m_representante
         */
        public Representante getRepresentante() {
            return m_representante;
        }

        /**
         * Set the value of m_sistemaPago
         *
         * @param newVar the new value of m_sistemaPago
         */
        public void setSistemaPago(SistemaPago newVar) {
            m_sistemaPago = newVar;
        }

        /**
         * Get the value of m_sistemaPago
         *
         * @return the value of m_sistemaPago
         */
        public SistemaPago getSistemaPago() {
            return m_sistemaPago;
        }

        //
        // Other methods
        //

        /**
         */
        public void programarDebito() {
            System.out.println("Programando débitos automáticos mensuales...");
        }

        /**
         */
        public void realizarCobroMensual() {
            System.out.println("\nse Realizara un cobro mensual en tarjeta del cliente " + m_cliente.getNombre());
        }

        /**
         */
        public void notificarRepresentante() {
            System.out.println("Notificando al representante sobre nueva solicitud...");
        }

    }
