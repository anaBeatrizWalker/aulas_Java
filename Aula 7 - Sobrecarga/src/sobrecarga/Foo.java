package sobrecarga;

public class Foo {
	public void metodo() {
		System.out.println("Método 1");
	}
	public void metodo(int x) {
		System.out.println("Método 2 com parâmetro int" );
	}
	
	public void metodo(int x, int y) {
		System.out.println("Método 3 com dois parâmetros int" );
	}
	
	public void metodo(double x) {
		System.out.println("Método 4 com parâmetro double" );
	}
}
