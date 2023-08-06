import java.text.DecimalFormat;

public class ConversorMonedas {
    //2. Conversor de Monedas: Crea una clase ConversorMonedas que contenga métodos para convertir una cantidad de dinero de una moneda a otra, por ejemplo, de dólares a euros o de pesos a dólares.

    public String convertirPesosADolares(double peso) {
        double dolares = 4140.21;
        double conversion = peso / dolares;
        DecimalFormat df = new DecimalFormat("#.00");

        return df.format(conversion);
    }

    public double convertirDolaresAEuros(double dolares) {
        double euro = 0.9070;
        double conversion = dolares * euro;
        return conversion;
    }

}
