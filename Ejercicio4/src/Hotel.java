import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private int id;
    private String nombre;
    List<Habitacion> habitaciones = new ArrayList<>();

    public Hotel() {
    }

    public Hotel(int id, String nombre, List<Habitacion> habitaciones) {
        this.id = id;
        this.nombre = nombre;
        this.habitaciones = habitaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int listaHabitaciones() {
        int habitacionesDisponibles = habitaciones.size();
        for (Habitacion habitacion:habitaciones) {
            if(habitacion.getReservada()) {
                habitacionesDisponibles--;
            }
        }
        return habitacionesDisponibles;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", habitaciones=" + habitaciones +
                '}';
    }
    
}
