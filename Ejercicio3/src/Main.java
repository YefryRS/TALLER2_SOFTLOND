public class Main {
    // 3. Calculadora Simple: Crea una clase Calculadora que contenga métodos para realizar operaciones matemáticas básicas, como suma, resta, multiplicación y división.
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.suma(2,2));
        System.out.println(calculadora.resta(2,2));
        System.out.println(calculadora.multiplicacion(2,2));
        System.out.println(calculadora.division(2,2));

    }
}