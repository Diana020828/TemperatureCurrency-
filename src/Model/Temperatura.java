package Model;

public class Temperatura {
	private String nombre;
	private double valor;

	public Temperatura(String nombre, double valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public double getValor() {
		return valor;
	}
}
