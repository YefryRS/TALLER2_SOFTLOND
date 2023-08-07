import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class Reserva {

    public void reservasHabitaciones(Habitacion habitacion, Empleado empleado) {
        habitacion.setEmpleado(empleado);
        habitacion.setReservada(true);
    }

    public void cancelarReservas(Habitacion habitacion) {
        habitacion.setEmpleado(null);
        habitacion.setReservada(false);
    }

}
