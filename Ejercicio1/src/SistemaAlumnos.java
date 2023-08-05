import java.util.ArrayList;
import java.util.List;

public class SistemaAlumnos {
    private List<Alumno> alumnos = new ArrayList<>();
    private Alumno alumno;

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public List<Alumno> agregarAlumnos(Alumno alumno) {
        alumnos.add(alumno);
        return alumnos;
    }

    public Alumno asignarCalificaciones(int id,double calificacion) {
        int idAlumno;

        for (Alumno item: alumnos) {
            idAlumno = item.getId();

            if(idAlumno == id) {
                item.setCalificaciones(calificacion);
                alumno = item;
            }

        }
        return alumno;
    }

    public double calcularPromedioCalificaciones() {
        double promedio = 0;
        for (Alumno item:alumnos) {
            promedio+= item.getCalificaciones();
        }
        return promedio;
    }

    public String mostrarInformacionAlumno() {
        return alumnos.toString();
    }

}
