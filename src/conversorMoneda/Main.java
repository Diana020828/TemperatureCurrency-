package conversorMoneda;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
        String[] options = {"Conversor de Temperatura", "Conversor de Moneda"};

        int seleccion = JOptionPane.showOptionDialog(
                null, "¿Qué conversor desea utilizar?", "Elige una opción", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (seleccion == 0) {
            // Ejecutar conversor de temperatura
            logicaVistaTemperatura.main(new String[]{});
        } else if (seleccion == 1) {
            // Ejecutar conversor de moneda
            PooConversor.main(new String[]{});
        } else {
            // Opción no válida
            JOptionPane.showMessageDialog(null, "Selección no válida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
