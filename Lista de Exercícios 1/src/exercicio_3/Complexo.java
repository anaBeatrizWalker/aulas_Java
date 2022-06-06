package exercicio_3;

public class Complexo {
	private double a, a1, a2; //parte real
	private double b, b1, b2; //parte imaginaria
	
	public Complexo(double a1, double b1, double a2, double b2){
		this.a1 = a1;
		this.b1 = b1;
		this.a2 = a2;
		this.b2 = b2;
	}
	
	public void soma() {
		a = a1 + a2;
		b = b1 + b2;
		System.out.printf("(%.1f + %.1fi) + (%.1f + %.1fi) = (%.1f + %.1fi)\n", a1, b1, a2, b2, a, b);
	}
	
	public void multiplica() {
		a = a1 * a2;
		b = b1 * b2;
		System.out.printf("(%.1f + %.1fi) * (%.1f + %.1fi) = (%.1f + %.1fi)\n", a1, b1, a2, b2, a, b);
	}
}
