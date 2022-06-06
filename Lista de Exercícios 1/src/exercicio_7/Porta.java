package exercicio_7;

public class Porta {
	boolean isOpen;
	static int numAberturas;
	
	void abrir() {
		isOpen = true;
		System.out.println("A porta abriu.");
		numAberturas++;
		System.out.println("Número de aberturas: " + numAberturas);
	}
	
	void fechar() {
		isOpen = false;
		System.out.println("A porta fechou.");
	}
}
