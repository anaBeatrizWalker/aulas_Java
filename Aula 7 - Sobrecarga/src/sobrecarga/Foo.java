package sobrecarga;

public class Foo {
	public void metodo() {
		System.out.println("M�todo 1");
	}
	public void metodo(int x) {
		System.out.println("M�todo 2 com par�metro int" );
	}
	
	public void metodo(int x, int y) {
		System.out.println("M�todo 3 com dois par�metros int" );
	}
	
	public void metodo(double x) {
		System.out.println("M�todo 4 com par�metro double" );
	}
}
