package forma1;

import java.util.ArrayList;
import java.util.List;

//NOTA: DECIDI HACERLO DE 2 MANERAS, PORQUE NO ENTENDI SI DESDE EL MAIN CREABA LOS OBJETOS O DIRECTAMENTE EN LA PRIMERA FUNCION DEBIA DE CREAR LOS ALUMNOS, QUE EN ESTE PACKAGE ESTA LA FORMA CREANDO LOS OBJETOS EN EL MAIN
public class Main {
    //1. Registro de Alumnos: Crea una clase Alumno con propiedades como nombre, edad y calificaciones. Luego, crea una clase SistemaAlumnos que permite agregar alumnos,asignar calificaciones , calcular el promedio de sus calificaciones y mostrar la información de cada alumno.

    public static void main(String[] args) {
        // Creacion de los objetos alumnos
        Alumno alumno1 = new Alumno(1,"Yefry",21);
        Alumno alumno2 = new Alumno(2,"Fernanda",30);
        Alumno alumno3 = new Alumno(3,"Pedro",27);
        Alumno alumno4 = new Alumno(4,"Esther",19);
        Alumno alumno5 = new Alumno(5,"Jesus",35);


        // Creacion del objeto sistemaAlumnos
        SistemaAlumnos sistemaAlumnos = new SistemaAlumnos();

        //1. Agregamos los alumnos
        sistemaAlumnos.agregarAlumnos(alumno1);
        sistemaAlumnos.agregarAlumnos(alumno2);
        sistemaAlumnos.agregarAlumnos(alumno3);
        sistemaAlumnos.agregarAlumnos(alumno4);
        sistemaAlumnos.agregarAlumnos(alumno5);


        //2. Asignar calificaciones
        sistemaAlumnos.asignarCalificaciones(1,3.5);
        sistemaAlumnos.asignarCalificaciones(1,4.5);
        sistemaAlumnos.asignarCalificaciones(1,5.0);
        sistemaAlumnos.asignarCalificaciones(2,1.5);
        sistemaAlumnos.asignarCalificaciones(2,4.3);
        sistemaAlumnos.asignarCalificaciones(2,3.7);


        //3. Calcular promedio de calificaciones
        System.out.println("El alumno " + alumno1.getNombre() + " tiene las siguientes calificaciones: " + alumno1.getCalificaciones() + " y su promedio es de: " +  sistemaAlumnos.calcularPromedioCalificaciones(alumno1)
        );

        System.out.println("El alumno " + alumno2.getNombre() + " tiene las siguientes calificaciones: " + alumno2.getCalificaciones() + " y su promedio es de: " +  sistemaAlumnos.calcularPromedioCalificaciones(alumno2)
        );

        System.out.println("----------------------------------------------");


        //4. mostrar la información de cada alumno

        System.out.println(sistemaAlumnos.mostrarInformacionAlumno());

    }
}