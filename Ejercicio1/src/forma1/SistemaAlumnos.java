package forma1;

import java.util.ArrayList;
import java.util.List;

public class SistemaAlumnos {
    private List<Alumno> alumnos = new ArrayList<>();

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public List<Alumno> agregarAlumnos(Alumno alumno) {
        alumnos.add(alumno);
        return alumnos;
    }

    public void asignarCalificaciones(int id,double calificacion) {

        for (Alumno item: alumnos) {

            if(item.getId() == id) {
                if(item.getCalificaciones() == null) {
                    item.setCalificaciones(new ArrayList<>());
                }
                item.getCalificaciones().add(calificacion);
            }

        }
    }

    public double calcularPromedioCalificaciones(Alumno alumno) {
        double sumaCalificaciones = 0;
        int total = alumno.getCalificaciones().size();

        for (int i = 0; i < alumno.getCalificaciones().size(); i++) {
            sumaCalificaciones+= alumno.getCalificaciones().get(i);
        }

        double promedio = sumaCalificaciones / total;
        return promedio;
    }

    public String mostrarInformacionAlumno() {
        return alumnos.toString();
    }
}
