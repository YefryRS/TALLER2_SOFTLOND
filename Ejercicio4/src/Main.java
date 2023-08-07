import java.util.ArrayList;
import java.util.List;

public class Main {

    /* Sistema de Reservas de Hotel: Crear un sistema de reservas de hotel que permita a los clientes corporativos reservar múltiples habitaciones en diferentes hoteles para hospedar a su personal. Debes tener clases como Hotel, Habitación, Cliente, y Reserva. Implementa métodos para listar habitaciones disponibles, realizar reservas y cancelar reservas. Al final de la ejecución del programa debe mostrar la siguiente info:
        ● Nombre de la empresa que reservó
        ● Nombre y cédula de quien ocupará cada habitación y número de la habitación que ocupará. Esto para cada hotel.
    */
    public static void main(String[] args) {

        //1. Creamos nuestros empleados y la empresa a la que pertenece
        List<Empleado> empleados = new ArrayList<>();

        Empleado empleado1 = new Empleado(123,"Yefry","Rodelo");
        Empleado empleado2 = new Empleado(456,"Esther","Rodelo");
        Empleado empleado3 = new Empleado(789,"Fernando","Perez");
        Empleado empleado4 = new Empleado(159,"Jose","Restrepo");
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);


        List<Empleado> empleados2 = new ArrayList<>();
        Empleado trabajador1 = new Empleado(001,"Pedro","Hernandez");
        Empleado trabajador2 = new Empleado(156,"Jackson","Martinez");
        empleados.add(trabajador1);
        empleados.add(trabajador2);


        Empresa empresa = new Empresa(1,"softlond",empleados);
        Empresa empresa2 = new Empresa(2,"Mercadolibre",empleados2);

        //2. Creamos nuestro hotel y las habitaciones que posee
        List<Habitacion> habitaciones = new ArrayList<>();
        Habitacion habitacion1 = new Habitacion(1);
        Habitacion habitacion2 = new Habitacion(2);
        Habitacion habitacion3 = new Habitacion(3);
        Habitacion habitacion4 = new Habitacion(4);
        Habitacion habitacion5 = new Habitacion(5);
        habitaciones.add(habitacion1);
        habitaciones.add(habitacion2);
        habitaciones.add(habitacion3);
        habitaciones.add(habitacion4);
        habitaciones.add(habitacion5);


        List<Habitacion> habitaciones2 = new ArrayList<>();
        Habitacion cuarto1 = new Habitacion(1);
        Habitacion cuarto2 = new Habitacion(2);
        Habitacion cuarto3 = new Habitacion(3);
        Habitacion cuarto4 = new Habitacion(4);
        Habitacion cuarto5 = new Habitacion(5);
        habitaciones2.add(cuarto1);
        habitaciones2.add(cuarto2);
        habitaciones2.add(cuarto3);
        habitaciones2.add(cuarto4);
        habitaciones2.add(cuarto5);


        Hotel hotel = new Hotel(1,"Hotel SAS",habitaciones);
        Hotel hotel2 = new Hotel(2,"Bank",habitaciones2);

        //3. Implementaremos los metodos correspondientes

        //3.1 listar habitaciones disponibles
        System.out.println("Las habitaciones disponibles son: " + hotel.listaHabitaciones());
        System.out.println("-----------------------------------------------");

        //3.2 Realizar reservas
        Reserva reserva = new Reserva();
        reserva.reservasHabitaciones(habitacion1,empleado1);
        reserva.reservasHabitaciones(habitacion3,empleado4);
        reserva.reservasHabitaciones(habitacion2,empleado2);

        System.out.println("Las habitaciones disponibles son: " + hotel.listaHabitaciones());
        System.out.println("-----------------------------------------------");


        //4. Mostrar toda la informacion
        System.out.println("Información de las reservas:");
        System.out.println("Hotel: " + hotel.getNombre());
        System.out.println("Empresa que reservo: " + empresa.getEmpresa());
        for (Habitacion habitacion : hotel.getHabitaciones()) {
            if (habitacion.getReservada()) {
                System.out.println("Habitación " + habitacion.getNumeroHabitacion() + " - Ocupada por: " +
                        habitacion.getEmpleado().getNombre() + " (Cédula: " +
                        habitacion.getEmpleado().getCedula() + ")");
            } else {
            System.out.println("Habitación " + habitacion.getNumeroHabitacion() + " - Disponible");
            }
        }

        System.out.println();

        //Cancelar reservas
        reserva.cancelarReservas(habitacion1);

        System.out.println("-----------------------------------------------");
        System.out.println("Las habitaciones disponibles son: " + hotel.listaHabitaciones());
        System.out.println("--------------------------------------------");

        //4. Mostrar toda la informacion, despues de la cancelacion (Empresa 1)
        System.out.println("DESPUES DE CANCELAR ");
        System.out.println("Información de las reservas:");
        System.out.println("Hotel: " + hotel.getNombre());
        System.out.println("Empresa que reservo: " + empresa.getEmpresa());
        for (Habitacion habitacion : hotel.getHabitaciones()) {
            if (habitacion.getReservada()) {
                System.out.println("Habitación " + habitacion.getNumeroHabitacion() + " - Ocupada por: " +
                        habitacion.getEmpleado().getNombre() + " (Cédula: " +
                        habitacion.getEmpleado().getCedula() + ")");
            } else {
                System.out.println("Habitación " + habitacion.getNumeroHabitacion() + " - Disponible");
            }
        }

        //4. Mostrar toda la informacion, despues de la cancelacion (Empresa 2)
        reserva.reservasHabitaciones(cuarto1,trabajador1);
        reserva.reservasHabitaciones(cuarto2,trabajador2);
        System.out.println("--------------------------------------------");
        System.out.println("Información de las reservas:");
        System.out.println("Hotel: " + hotel2.getNombre());
        System.out.println("Empresa que reservo: " + empresa2.getEmpresa());
        for (Habitacion habitacion : hotel2.getHabitaciones()) {
            if (habitacion.getReservada()) {
                System.out.println("Habitación " + habitacion.getNumeroHabitacion() + " - Ocupada por: " +
                        habitacion.getEmpleado().getNombre() + " (Cédula: " +
                        habitacion.getEmpleado().getCedula() + ")");
            } else {
                System.out.println("Habitación " + habitacion.getNumeroHabitacion() + " - Disponible");
            }
        }

    }
}