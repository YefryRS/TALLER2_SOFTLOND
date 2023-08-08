package forma2;


import java.util.ArrayList;
import java.util.List;

public class SistemaAlumnos2 {
    private List<Alumno2> alumnos = new ArrayList<>();

    public List<Alumno2> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno2> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Alumno2> agregarAlumnos(int id, String nombre, int edad) {
        Alumno2 alumnoGuardar = new Alumno2();
        alumnoGuardar.setId(id);
        alumnoGuardar.setNombre(nombre);
        alumnoGuardar.setEdad(edad);

        alumnos.add(alumnoGuardar);
        return alumnos;
    }

    public void asignarCalificaciones(int id,double calificacion) {

        for (Alumno2 item: alumnos) {

            if(item.getId() == id) {
                if(item.getCalificaciones() == null) {
                    item.setCalificaciones(new ArrayList<>());
                }
                item.getCalificaciones().add(calificacion);
            }

        }
    }

    public double calcularPromedioCalificaciones(int id ) {

        double sumaCalificaciones = 0;
        int total = 0;

        for (Alumno2 alumno:alumnos) {
            if(alumno.getId() == id) {
                for (int i = 0; i < alumno.getCalificaciones().size(); i++) {
                    sumaCalificaciones+= alumno.getCalificaciones().get(i);
                }
                total = alumno.getCalificaciones().size();
            }
        }

        double promedio = sumaCalificaciones / total;
        return promedio;
    }

    public String mostrarInformacionAlumno() {
        return alumnos.toString();
    }
}
