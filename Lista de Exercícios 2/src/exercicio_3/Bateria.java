package exercicio_3;

public class Bateria {
	private double carga;
	
	public Bateria(double carga) {
		this.carga = carga;
	}
	
	public double getCarga() {
		return carga;
	}

	public void descarrega() {
		carga = carga - 10;
	}
	
	public void mostrar() {
		System.out.println("Bateria em " + carga);
	}
}
