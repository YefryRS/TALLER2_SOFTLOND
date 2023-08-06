package forma2;

import forma1.Alumno;
import forma1.SistemaAlumnos;

//NOTA: EN ESTE PACKAGE ESTA LA FORMA CREANDO LOS OBJETOS DESDE LA CLASE SISTEMA_ALUMNOS
public class Main2 {
    //1. Registro de Alumnos: Crea una clase Alumno con propiedades como nombre, edad y calificaciones. Luego, crea una clase SistemaAlumnos que permite agregar alumnos,asignar calificaciones , calcular el promedio de sus calificaciones y mostrar la información de cada alumno.

    public static void main(String[] args) {

        // Creacion del objeto sistemaAlumnos
        SistemaAlumnos2 sistemaAlumnos = new SistemaAlumnos2();

        //1. Agregamos los alumnos
        sistemaAlumnos.agregarAlumnos(1,"Yefry",21);
        sistemaAlumnos.agregarAlumnos(2,"Fernanda",30);
        sistemaAlumnos.agregarAlumnos(3,"Pedro",27);
        sistemaAlumnos.agregarAlumnos(4,"Esther",19);
        sistemaAlumnos.agregarAlumnos(5,"Jesus",35);

        System.out.println("----------------------------------------------");

        //2. Asignar calificaciones
        System.out.println(sistemaAlumnos.asignarCalificaciones(1,4.3));
        System.out.println(sistemaAlumnos.asignarCalificaciones(2,4.7));
        System.out.println(sistemaAlumnos.asignarCalificaciones(5,3.6));

        System.out.println("----------------------------------------------");

        //3. Calcular promedio de calificaciones
        System.out.println(sistemaAlumnos.calcularPromedioCalificaciones());

        System.out.println("----------------------------------------------");


        //4. mostrar la información de cada alumno

        System.out.println(sistemaAlumnos.mostrarInformacionAlumno());

    }
}