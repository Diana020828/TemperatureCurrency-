package conversorMoneda;

import javax.swing.JOptionPane;

public class PooConversor {

    public static void main(String[] args) {
        Moneda[] Monedas = new Moneda[6];
        Monedas[0] = new Moneda(4175, "Dolar");
        Monedas[1] = new Moneda(4576, "Euro");
        Monedas[2] = new Moneda(5353, "Libra Esterlina");
        Monedas[3] = new Moneda(29.25, "Yen");
        Monedas[4] = new Moneda(3.21, "Won Surcoreano");
        Monedas[5] = new Moneda(1, "COP");

        String[] options = new String[Monedas.length];
        for (int i = 0; i < Monedas.length; i++) {
            options[i] = Monedas[i].getNombre();
        }

        String seleccionarMoneda = (String) JOptionPane.showInputDialog(
                null, "Elija una moneda","Conversor de Monedas", JOptionPane.PLAIN_MESSAGE,
                null, options,options[0]);

       double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Escriba la cantidad a convertir"));
        
       double resultado = 0;

       if (seleccionarMoneda.equals("COP")) {
           String seleccionarMonedaP = (String) JOptionPane.showInputDialog(
                   null, "Elija una moneda", "Conversor de Monedas", JOptionPane.PLAIN_MESSAGE,
                   null, options, options[0]);

           for (int i = 0; i < Monedas.length; i++) {
               if (seleccionarMonedaP.equals(Monedas[i].getNombre())) {
                   resultado = cantidad / Monedas[i].getValor();
                   break;
               }
           }
       } else {
           for (int i = 0; i < Monedas.length; i++) {
               if (seleccionarMoneda.equals(Monedas[i].getNombre())) {
                   resultado = cantidad * Monedas[i].getValor();
                   break;
               }
           }
       }
       JOptionPane.showMessageDialog(null, "Es equivalante a: " + resultado +" " + " pesos colombianos");
   }

}
