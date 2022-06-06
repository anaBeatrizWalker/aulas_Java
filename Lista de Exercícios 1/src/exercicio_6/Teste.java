package exercicio_6;

public class Teste {

	public static void main(String[] args) {
		
		Eq2Grau z = new Eq2Grau(5, 9, 3);
		
		System.out.println("Delta: " + z.delta()); //Delta: 21.0
		System.out.println("Raiz 1: " + z.raiz1()); //Raiz 1: -0.44174243050441603
		System.out.println("Raiz 2: " + z.raiz2()); //Raiz 2: -1.3582575694955838
	}
}