package conversorMoneda;

public class Temperatura {
		String nombre;
		double valor;
		
		public Temperatura(String nombre, double valor) {
			super();
			this.nombre = nombre;
			this.valor = valor;
		}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}
	}
