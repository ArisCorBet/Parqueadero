public class Tarifa {
    private double precioPorHora;
    private String tipoVehiculo;
    private String descripcion;

    public Tarifa(double precioPorHora, String tipoVehiculo, String descripcion) {
        this.precioPorHora = precioPorHora;
        this.tipoVehiculo = tipoVehiculo;
        this.descripcion = descripcion;
    }

    public double calcularCosto(int horas) {
        return precioPorHora * horas;
    }
}
