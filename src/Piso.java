import java.util.ArrayList;
import java.util.List;

public class Piso {
    private int numero;
    private int capacidad;
    private List<PlazaParqueo> plazas;

    public Piso(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.plazas = new ArrayList<>();
    }

    public void agregarPlaza(PlazaParqueo plaza) {
        plazas.add(plaza);
    }

    public String consultarDisponibilidad() {
        // Implementación de consulta de disponibilidad
        return "Disponible";
    }
}
