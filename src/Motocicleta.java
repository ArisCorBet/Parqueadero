public class Motocicleta extends Vehiculo {
    private int cilindraje;

    public Motocicleta(String matricula, String modelo, String color, int cilindraje) {
        super(matricula, modelo, color);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
}
