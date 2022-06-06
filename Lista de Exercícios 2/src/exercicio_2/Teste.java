package exercicio_2;

public class Teste {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Ana Beatriz", 5000, 200);
		c1.sacar(800);

		Cliente c2 = new Cliente("Gustavo", 7000, 500);

		Doc a = new Doc(c1, c2, 100);
		a.tranferir(c1, c2, 50);
	}
}
