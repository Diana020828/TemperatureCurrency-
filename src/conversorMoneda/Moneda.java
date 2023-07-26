package conversorMoneda;

public class Moneda {
	double valor;
	String nombre;
	

	public Moneda(double valor, String nombre) {
		super();
		this.valor = valor;
		this.nombre = nombre;
	}

	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
