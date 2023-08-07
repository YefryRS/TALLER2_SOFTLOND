package forma2;

import java.util.ArrayList;
import java.util.List;

public class SistemaAlumnos2 {
    private List<Alumno2> alumnos = new ArrayList<>();
    private Alumno2 alumno;

    public List<Alumno2> agregarAlumnos(int id,String nombre,int edad) {
        Alumno2 alumnoGuardar = new Alumno2();
        alumnoGuardar.setId(id);
        alumnoGuardar.setNombre(nombre);
        alumnoGuardar.setEdad(edad);

        alumnos.add(alumnoGuardar);
        return alumnos;
    }

    public Alumno2 asignarCalificaciones(int id,double calificacion) {
        int idAlumno;

        for (Alumno2 item: alumnos) {
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
        for (Alumno2 item:alumnos) {
            promedio+= item.getCalificaciones();
        }
        return promedio;
    }

    public String mostrarInformacionAlumno() {
        return alumnos.toString();
    }
}
