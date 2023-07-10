package conversorMoneda;
import java.util.Scanner;

public class PooConversor {
	public static void main (String[] args) {
		Moneda monedasEnPesosMoneda[] = new Moneda[5];
		monedasEnPesosMoneda[0] = new Moneda(4.175, "Dólar");
		monedasEnPesosMoneda[1] = new Moneda(4.576, "Euro");
		monedasEnPesosMoneda[2] = new Moneda(5353, "Libra Esterlina");
		monedasEnPesosMoneda[3] = new Moneda(29.25, "Yen");
		monedasEnPesosMoneda[4] = new Moneda(3.21, "Won Surcoreano");

// ----------------- Scanner ----------------- //
		Scanner moneda = new Scanner(System.in);
		System.out.println("Escriba el nombre de la moneda que desea convertir a moneda colombiana: ");
		String nombreMoneda = moneda.nextLine();
		try {
			for (int i=0; i<monedasEnPesosMoneda.length; i++) {
				if (nombreMoneda.equals(monedasEnPesosMoneda[i].getNombre())) {
					System.out.println("Un " + monedasEnPesosMoneda[i].getNombre() + " vale: " 
					+ monedasEnPesosMoneda[i].getValor() + " pesos colombianos");
				}
			}
		} catch (Exception e) {
			System.out.println("Elija una moneda válida");
		}
		System.out.println("Escriba la cantidad de " + nombreMoneda + " que desea convertir ");
//		double cantidadMoneda = moneda.nextDouble();
//		cantidadMoneda = cantidadMoneda * nombreMoneda.getValor();
		moneda.close();

// ----------------- FOR ----------------- //
		System.out.println("FOR");
		for (double i=0; i<monedasEnPesosMoneda.length; i++) {
			System.out.println("Un " + monedasEnPesosMoneda[(int) i].getNombre() + " vale: " 
			+ monedasEnPesosMoneda[(int) i].getValor() + " pesos colombianos");
		}
// ----------------- FOR EACH ----------------- //


	}

}
