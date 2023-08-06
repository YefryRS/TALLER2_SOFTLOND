public class Main {
    //2. Conversor de Monedas: Crea una clase ConversorMonedas que contenga métodos para convertir una cantidad de dinero de una moneda a otra, por ejemplo, de dólares a euros o de pesos a dólares.
    public static void main(String[] args) {
        // Instanciamos la clase
        ConversorMonedas conversorMonedas = new ConversorMonedas();

        //1. Convertir dólares a euros
        double dolaresAEuros = conversorMonedas.convertirDolaresAEuros(500);

        //2. Convertir Pesos a dolares
        String pesosADolares = conversorMonedas.convertirPesosADolares(1500000);

        System.out.println(dolaresAEuros);
        System.out.println(pesosADolares);

    }
}