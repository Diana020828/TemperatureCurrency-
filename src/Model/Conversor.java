package Model;

public class Conversor {

    private Moneda[] monedas;
    private Temperatura[] temperaturas;

    public Conversor(Moneda[] monedas, Temperatura[] temperaturas) {
        this.monedas = monedas;
        this.temperaturas = temperaturas;
    }

    public String MoneyToString() {
        String name = "";
        for (int i = 0; i < monedas.length; i++) {
            name += monedas[i].getNombre() + " \n";
        }
        return name;
    }

    public String temperatureToString() {

    }

    public double convertMoney(String to, String from, double value) {
        // de pesos colombianos a euros, teniendo 4000 pesos
        // from pesos colombianos
        // to euros
        // value 4000
    }

    public double convertTemperature(String to, String from, double value) {

    }

}
