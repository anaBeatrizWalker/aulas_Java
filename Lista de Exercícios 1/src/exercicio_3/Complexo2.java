package exercicio_3;

public class Complexo2 {
	private double a;
	private double b;
	
	public Complexo2 (double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	//Valores padrão se nenhum for passado
	public Complexo2() {
		this.a = 0.0;
		this.b = 0.0;
	}
	
	public static Complexo2 soma(Complexo2 x, Complexo2 y) {
		return new Complexo2 (x.a + y.a, x.b + y.b);
	}
	
	public static Complexo2 multiplica(Complexo2 x, Complexo2 y) {
		return new Complexo2 (x.a * y.a, x.b * y.b);
	}
	
	public String toString() {
		return "(" + a + " + " + b + "i)";
	}
}
