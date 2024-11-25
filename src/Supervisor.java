public class Supervisor extends Empleado {
    public Supervisor(String nombre, int identificacion) {
        super(nombre, identificacion);
    }

    @Override
    public void gestionarReservas() {
        // Implementación específica del supervisor
    }

    @Override
    public void asignarTarea() {
        // Implementación específica del supervisor
    }
}
