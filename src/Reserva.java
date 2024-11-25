import java.util.Date;

public class Reserva {
    private int numeroReserva;
    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    private int plazaReservada;
    private String estadoReserva;

    public Reserva(int numeroReserva, Date fechaHoraInicio, Date fechaHoraFin, int plazaReservada) {
        this.numeroReserva = numeroReserva;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.plazaReservada = plazaReservada;
        this.estadoReserva = "Pendiente";
    }

    public void confirmarReserva() {
        this.estadoReserva = "Confirmada";
    }

    public void cancelarReserva() {
        this.estadoReserva = "Cancelada";
    }

    public String getEstadoReserva() { // Método para obtener el estado de la reserva
        return estadoReserva;
    }
}
