import java.util.Scanner;

public class Main {
    //2. Conversor de Monedas: Crea una clase ConversorMonedas que contenga métodos para convertir una cantidad de dinero de una moneda a otra, por ejemplo, de dólares a euros o de pesos a dólares.

    //NOTA: PARA ESTE EJERCICIO DECIDI TOMAR LA TASA DE CAMBIO DEL DIA 07 DE AGOSTO DEL PRESENTE AÑO(07/08/2023)
    public static void main(String[] args) {
        ConversorMonedas conversorMonedas = new ConversorMonedas();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el tipo de moneda que deseas hacerla la conversion(COP, MXN, USD, EUR)");
        String moneda = scanner.nextLine();
        String monedaAConvertir = moneda.toUpperCase();

        System.out.println("Escribe el valor a convertir");
        double valorMonedaAConvertir = scanner.nextDouble();

        System.out.println("Ten en cuenta que el COP al ser la moneda nacional y el USD al ser la internacional mas importante, son las únicas que tendran conversiones a las otras 3 monedas. Pero el MXN y el EUR solo tendran conversiones al COP, al ser esta la moneda nacional");

        switch (monedaAConvertir) {
            case "COP":
                System.out.println("La moneda :" + valorMonedaAConvertir + "COP, tiene las siguientes conversiones");
                System.out.println("Euro: " + conversorMonedas.pesoColombianoAEuro(valorMonedaAConvertir));
                System.out.println("Peso Mexicano: " + conversorMonedas.pesoColombianoAPesoMexicano(valorMonedaAConvertir));
                System.out.println("Dolar: " +conversorMonedas.pesosColombianosADolares(valorMonedaAConvertir));
                break;
            case "MXN":
                System.out.println("La moneda :" + valorMonedaAConvertir + "MXN, tiene las siguientes conversiones");
                System.out.println("Peso Colombiano: " + conversorMonedas.pesoMexicanoAPesoColombiano(valorMonedaAConvertir));
                break;
            case "USD":
                System.out.println("La moneda :" + valorMonedaAConvertir + "USD, tiene las siguientes conversiones");
                System.out.println("Peso Colombiano: " + conversorMonedas.dolaresAPesosColombiano(valorMonedaAConvertir));
                System.out.println("Euro: " + conversorMonedas.dolaresAEuros(valorMonedaAConvertir));
                System.out.println("Peso Mexicano: " + conversorMonedas.dolaresAPesosMexicanos(valorMonedaAConvertir));
                break;
            case "EUR":
                System.out.println("La moneda :" + valorMonedaAConvertir + "EUR, tiene las siguientes conversiones");
                System.out.println("Peso Colombiano: " + conversorMonedas.euroAPesoColombiano(valorMonedaAConvertir));
                break;
        }

        /* System.out.println("Escribe el tipo de moneda a la que deseas convertir el valor anterior (peso colombiano, peso mexicano, dolar, euro)");
        String tipoDeMonedaAConvertir = scanner.nextLine(); */



    }
}