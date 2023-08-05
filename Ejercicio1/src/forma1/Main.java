package forma1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //1. Registro de Alumnos: Crea una clase Alumno con propiedades como nombre, edad y calificaciones. Luego, crea una clase SistemaAlumnos que permite agregar alumnos,asignar calificaciones , calcular el promedio de sus calificaciones y mostrar la información de cada alumno.

    public static void main(String[] args) {
        // Creacion de los objetos alumnos
        Alumno alumno1 = new Alumno(1,"Yefry",21,5.0);
        Alumno alumno2 = new Alumno(2,"Fernanda",30,3.0);
        Alumno alumno3 = new Alumno(3,"Pedro",27,4.5); Alumno alumno4 = new Alumno(4,"Esther",19,3.6);
        Alumno alumno5 = new Alumno(5,"Jesus",35,4.3);


        // Creacion del objeto sistemaAlumnos
        SistemaAlumnos sistemaAlumnos = new SistemaAlumnos();

        //1. Agregamos los alumnos
        sistemaAlumnos.agregarAlumnos(alumno1);
        sistemaAlumnos.agregarAlumnos(alumno2);
        sistemaAlumnos.agregarAlumnos(alumno3);
        sistemaAlumnos.agregarAlumnos(alumno4);
        sistemaAlumnos.agregarAlumnos(alumno5);

        System.out.println("----------------------------------------------");

        //2. Asignar calificaciones
        System.out.println(sistemaAlumnos.asignarCalificaciones(1,3.5));

        System.out.println("----------------------------------------------");

        //3. Calcular promedio de calificaciones
        System.out.println(sistemaAlumnos.calcularPromedioCalificaciones());

        System.out.println("----------------------------------------------");


        //4. mostrar la información de cada alumno

        System.out.println(sistemaAlumnos.mostrarInformacionAlumno());

    }
}