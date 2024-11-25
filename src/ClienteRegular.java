public class ClienteRegular extends Usuario {
    private boolean suscripcionActiva;
    private String metodoPago;
    private String fechaSuscripcion;

    public ClienteRegular(String nombre, int cedula, boolean suscripcionActiva, String metodoPago, String fechaSuscripcion) {
        super(nombre, cedula);
        this.suscripcionActiva = suscripcionActiva;
        this.metodoPago = metodoPago;
        this.fechaSuscripcion = fechaSuscripcion;
    }

    public boolean isSuscripcionActiva() {
        return suscripcionActiva;
    }

    public void setSuscripcionActiva(boolean suscripcionActiva) {
        this.suscripcionActiva = suscripcionActiva;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getFechaSuscripcion() {
        return fechaSuscripcion;
    }

    public void setFechaSuscripcion(String fechaSuscripcion) {
        this.fechaSuscripcion = fechaSuscripcion;
    }

    @Override
    public void consultarDatosUsuario() {
        // Implementación para consultar datos del cliente regular
    }

    public void reservarPlaza() {
        // Implementación para reservar plaza
    }
}
