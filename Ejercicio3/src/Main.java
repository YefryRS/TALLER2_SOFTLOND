import java.util.Scanner;

public class Main {
    // 3. Calculadora Simple: Crea una clase Calculadora que contenga métodos para realizar operaciones matemáticas básicas, como suma, resta, multiplicación y división.
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el primer numero");
        int num1 = scanner.nextInt();

        System.out.println("Digita el segundo numero");
        int num2 = scanner.nextInt();

        System.out.println( num1 + " + " + num2 + " = " + calculadora.suma(num1,num2));
        System.out.println( num1 + " - " + num2 + " = " + calculadora.resta(num1,num2));
        System.out.println( num1 + " * " + num2 + " = " + calculadora.multiplicacion(num1,num2));
        System.out.println( num1 + " / " + num2 + " = " + calculadora.division(num1,num2));

    }
}