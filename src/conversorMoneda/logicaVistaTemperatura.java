package conversorMoneda;

import javax.swing.JOptionPane;

public class logicaVistaTemperatura {
	
	public static void main(String[] args) {
		
		Temperatura[] temperaturas = new Temperatura[2];
		temperaturas[0] = new Temperatura("Celsius", 0);
		temperaturas[0] = new Temperatura("Fahrenheit", 0);
		
		 String[] options = {"Celsius a Fahrenheit", "Fahrenheit a Celsius"};
	        int seleccion = JOptionPane.showOptionDialog(
	                null, "Elija la conversión:", "Conversor de Temperatura", JOptionPane.DEFAULT_OPTION,
	                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

	        double resultado = 0;
	     // Celsius a Fahrenheit
	        if (seleccion == 0) { 
	            double celsius = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en Celsius:"));
	            resultado = (celsius * 9 / 5) + 32;
	            JOptionPane.showMessageDialog(null, "Temperatura en Fahrenheit: " + resultado);
	        } // Fahrenheit a Celsius
	        else if (seleccion == 1) { 
	            double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en Fahrenheit:"));
	            resultado = (fahrenheit - 32) * 5 / 9;
	            JOptionPane.showMessageDialog(null, "Temperatura en Celsius: " + resultado);
	        } else {
	            JOptionPane.showMessageDialog(null, "Selección no válida.", "Error", JOptionPane.ERROR_MESSAGE);
	        }
		}
	}
