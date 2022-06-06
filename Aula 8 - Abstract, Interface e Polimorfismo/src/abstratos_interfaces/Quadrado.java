package abstratos_interfaces;

public class Quadrado extends Quadrilatero{

	public Quadrado(double lado) {
		super(lado);
	}
	
	@Override
	public double calcPerim() {
		return 4*getLado();
	}
	
	@Override
	public double calcArea() {
		return getLado()*getLado();
	}

}
