public class Habitacion {
    private int numeroHabitacion;
    private Empleado empleado;
    private boolean reservada;


    public Habitacion() {
    }

    public Habitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public boolean getReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numeroHabitacion=" + numeroHabitacion +
                ", empleado=" + empleado +
                ", reservada=" + reservada +
                '}';
    }
}
