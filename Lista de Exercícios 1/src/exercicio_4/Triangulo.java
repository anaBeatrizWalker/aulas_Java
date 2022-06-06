package exercicio_4;

public class Triangulo {
	double lado;
	int perimetro;
	int area;
	
	Triangulo(double lado){
		this.lado = lado;
	}
	
	public double calcArea() {
		return lado * (Math.sqrt(3) / 2);
	}
	
	public double calcPerimetro() {
		return 3*lado;
	}
}
