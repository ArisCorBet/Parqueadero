import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private String nombre;
    private String ubicacion;
    private int numeroPiso;
    private int capacidadTotal;
    private List<Piso> pisos;

    public Parqueadero(String nombre, String ubicacion, int numeroPiso, int capacidadTotal) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.numeroPiso = numeroPiso;
        this.capacidadTotal = capacidadTotal;
        this.pisos = new ArrayList<>();
    }

    public void agregarPiso(Piso piso) {
        pisos.add(piso);
    }

    public String consultarDisponibilidad() {
        // Implementación de consulta de disponibilidad
        return "Disponible";
    }

    public String consultarEstado() {
        // Implementación para consultar estado del parqueadero
        return "Libre";
    }
}
