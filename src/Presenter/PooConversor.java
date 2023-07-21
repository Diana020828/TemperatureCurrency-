package Presenter;

import Model.*;
import View.*;
import javax.swing.JOptionPane;

public class PooConversor {

    private View view;
    private Conversor conversor;

    public PooConversor() {
        view = new View();
        dataSet();
    }

    public void dataSet() {
        Moneda[] monedas = new Moneda[6];
        monedas[0] = new Moneda(4175, "Dolar");
        monedas[1] = new Moneda(4576, "Euro");
        monedas[2] = new Moneda(5353, "Libra Esterlina");
        monedas[3] = new Moneda(29.25, "Yen");
        monedas[4] = new Moneda(3.21, "Won Surcoreano");
        monedas[5] = new Moneda(1, "COP");

        Temperatura[] temperaturas = new Temperatura[5];
        temperaturas[0] = new Temperatura("Celsius", 1);
        temperaturas[1] = new Temperatura("Fahrenheit", 2);
        temperaturas[2] = new Temperatura("Kelvin", 3);
        temperaturas[3] = new Temperatura("Rankine", 4);
        temperaturas[4] = new Temperatura("Reaumur", 5);

        conversor = new Conversor(monedas, temperaturas);
    }

    public void convertMoney() {
        String money = view.readString("Por favor, escoja su moneda de origen: " + conversor.MoneyToString());
        // moneda a la que va a covertir
        // valor

        // si ya escogió colombia

        // String seleccionarMoneda = (String) JOptionPane.showInputDialog(
        // null, "Elija una moneda", "Conversor de Monedas", JOptionPane.PLAIN_MESSAGE,
        // null, options, options[0]);

    }

    public void convertTemperature() {

    }

    public void menu() {
        try {
            view.showGraficMessage("BIENVENIDO AL SISTEMA DE CONVERSIÓN");
            int option = view.readInteger(
                    "Digite alguna de estas opciones: 1. Convertir de Moneda \n2.Convertir temperatura \n3. Salir");
            while (option != 3) {
                switch (option) {
                    case 1:
                        convertMoney();
                        break;
                    case 2:
                        convertTemperature();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        view.showGraficMessage("Opción no es valida");
                        menu();
                        break;
                }
            }
        } catch (Exception e) {
            view.showGraficMessage("MAL");
            menu();
        }
    }

    public static void main(String[] args) {

        PooConversor pc = new PooConversor();
        pc.menu();

        // double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Escriba la
        // cantidad a convertir"));

        // double resultado = 0;

        // if (seleccionarMoneda.equals("COP")) {
        // String seleccionarMonedaP = (String) JOptionPane.showInputDialog(
        // null, "Elija una moneda", "Conversor de Monedas", JOptionPane.PLAIN_MESSAGE,
        // null, options, options[0]);

        // for (int i = 0; i < Monedas.length; i++) {
        // if (seleccionarMonedaP.equals(Monedas[i].getNombre())) {
        // resultado = cantidad / Monedas[i].getValor();
        // break;
        // }
        // }
        // } else {
        // for (int i = 0; i < Monedas.length; i++) {
        // if (seleccionarMoneda.equals(Monedas[i].getNombre())) {
        // resultado = cantidad * Monedas[i].getValor();
        // break;
        // }
        // }
        // }
        // JOptionPane.showMessageDialog(null, "Es equivalante a: " + resultado + " " +
        // " pesos colombianos");
        // }
    }
}
