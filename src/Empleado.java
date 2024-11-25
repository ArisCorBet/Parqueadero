public abstract class Empleado implements IEmpleado {
    private String nombre;
    private int identificacion;

    public Empleado(String nombre, int identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }
}
