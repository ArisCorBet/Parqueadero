import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear un parqueadero
        Parqueadero parqueadero = new Parqueadero("Parqueadero Central", "Calle 123", 3, 50);

        // Crear pisos y plazas
        Piso piso1 = new Piso(1, 20);
        PlazaParqueo plaza1 = new PlazaParqueo(1, "Automovil");

        piso1.agregarPlaza(plaza1);
        parqueadero.agregarPiso(piso1);

        // Crear un vehículo
        Automovil auto = new Automovil("ABC123", "Toyota Corolla", "Rojo", 4);

        // Reservar una plaza
        plaza1.reservarPlaza(auto);
        System.out.println("Estado de la plaza: " + plaza1.getEstado());

        // Crear un cliente regular
        ClienteRegular cliente = new ClienteRegular("Juan Perez", 12345678, true, "Tarjeta", "2024-01-01");

        // Usar el cliente para reservar una plaza
        if (cliente.isSuscripcionActiva()) {
            System.out.println(cliente.getNombre() + " puede reservar plazas.");
        }

        // Crear una reserva
        Reserva reserva = new Reserva(1, new Date(), new Date(), plaza1.getNumeroPlaza());
        reserva.confirmarReserva();
        System.out.println("Estado de la reserva: " + reserva.getEstadoReserva());
    }
}
