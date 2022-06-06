package exercicio_2;

public class Teste {
	public static void main(String[] args) {
		Lampada a = new Lampada();
		System.out.println("A lâmpada está apagada agora.");
		a.clicked(); //acendeu
		a.clicked(); //apagou
		a.clicked(); //acendeu
		a.clicked(); //quebrou e apagou
		a.clicked(); //apagada
	}

}
