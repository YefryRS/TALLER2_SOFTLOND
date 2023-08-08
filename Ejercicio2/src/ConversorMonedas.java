import java.text.DecimalFormat;

public class ConversorMonedas {
    //2. Conversor de Monedas: Crea una clase ConversorMonedas que contenga métodos para convertir una cantidad de dinero de una moneda a otra, por ejemplo, de dólares a euros o de pesos a dólares.

    public String pesosColombianosADolares(double peso) {
        double dolares = 0.00025;
        double conversion = peso * dolares;
        DecimalFormat df = new DecimalFormat("#.00");

        return df.format(conversion);
    }

    public String dolaresAPesosColombiano(double dolar) {
        double peso = 4028.85;
        double conversion = dolar * peso;
        DecimalFormat df = new DecimalFormat("#.00");

        return df.format(conversion);
    }

    public String pesoColombianoAPesoMexicano(double peso) {
        double pesoMexicano = 0.0042;
        double conversion = peso * pesoMexicano;
        DecimalFormat df = new DecimalFormat("#.00");

        return df.format(conversion);
    }

    public String pesoMexicanoAPesoColombiano(double peso) {
        double pesoColombiano = 235.43;
        double conversion = peso * pesoColombiano;
        DecimalFormat df = new DecimalFormat("#.00");

        return df.format(conversion);
    }

    public String pesoColombianoAEuro(double peso) {
        double euro = 0.00023;
        double conversion = peso * euro;
        DecimalFormat df = new DecimalFormat("#.00");

        return df.format(conversion);
    }

    public String euroAPesoColombiano(double euro) {
        double peso = 4426.72;
        double conversion = peso * euro;
        DecimalFormat df = new DecimalFormat("#.00");

        return df.format(conversion);
    }

    public double dolaresAEuros(double dolares) {
        double euro = 0.91;
        double conversion = dolares * euro;
        return conversion;
    }

    public String dolaresAPesosMexicanos(double dolar) {
        double peso = 17.11;
        double conversion = dolar * peso;
        DecimalFormat df = new DecimalFormat("#.00");

        return df.format(conversion);
    }


}
