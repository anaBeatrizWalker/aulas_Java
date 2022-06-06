package sobrescrita;

public class Retangulo extends Quadrilatero{
	
	private double lado2;
	
	public Retangulo(double lado, double lado2) {
		super(lado);
		this.lado2 = lado2;
	}
	
	@Override
	public double calcPerim() {
		return 2*(getLado() + lado2);
	}
	
	@Override
	public double calcArea() {
		return getLado()*lado2;
	}
}
