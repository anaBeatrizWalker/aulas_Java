package aula.sobreProtected;

public class Teste {

	public static void main(String[] args) {
		
		Peixe a = new Peixe("Nemo", "Palha�o", "Glub");
		// a.comer(); //n�o � acessivel
		a.nadar();
	}
}
