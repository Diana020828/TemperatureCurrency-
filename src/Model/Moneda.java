package Model;

public class Moneda {
	private double valor;
	private String nombre;

	public Moneda(double valor, String nombre) {
		this.valor = valor;
		this.nombre = nombre;
	}

	public double getValor() {
		return valor;
	}

	public String getNombre() {
		return nombre;
	}

}
