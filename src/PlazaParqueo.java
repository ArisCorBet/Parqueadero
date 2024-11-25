public class PlazaParqueo {
    private int numeroPlaza;
    private String estado; // Libre, Ocupada, Reservada
    private String tipoVehiculo;
    private Vehiculo vehiculoAsignado;

    public PlazaParqueo(int numeroPlaza, String tipoVehiculo) {
        this.numeroPlaza = numeroPlaza;
        this.estado = "Libre";
        this.tipoVehiculo = tipoVehiculo;
    }

    public void reservarPlaza(Vehiculo vehiculo) {
        this.estado = "Reservada";
        this.vehiculoAsignado = vehiculo;
    }

    public void liberarPlaza() {
        this.estado = "Libre";
        this.vehiculoAsignado = null;
    }

    public String getEstado() {
        return estado;
    }

    public int getNumeroPlaza() { // Método para obtener el número de plaza
        return numeroPlaza;
    }
}
