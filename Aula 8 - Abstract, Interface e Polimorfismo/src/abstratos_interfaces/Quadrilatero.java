package abstratos_interfaces;

public abstract class Quadrilatero {
	
	private double lado;

	public Quadrilatero(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}
	
	public abstract double calcPerim();
	
	public abstract double calcArea();
	
}
