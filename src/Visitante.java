public class Visitante extends Usuario {
    private int tiempoUso;

    public Visitante(String nombre, int cedula, int tiempoUso) {
        super(nombre, cedula);
        this.tiempoUso = tiempoUso;
    }

    public int getTiempoUso() {
        return tiempoUso;
    }

    public void setTiempoUso(int tiempoUso) {
        this.tiempoUso = tiempoUso;
    }

    @Override
    public void consultarDatosUsuario() {
        // Implementación para consultar datos del visitante
    }

    public double calcularTarifa() {
        // Implementación para calcular tarifa
        return 0.0;
    }
}
