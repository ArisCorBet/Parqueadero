public class Bicicleta extends Vehiculo {
    private String tipoBicicleta;

    public Bicicleta(String matricula, String modelo, String color, String tipoBicicleta) {
        super(matricula, modelo, color);
        this.tipoBicicleta = tipoBicicleta;
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }
}
