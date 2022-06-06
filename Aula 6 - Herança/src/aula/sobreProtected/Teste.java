package aula.sobreProtected;

public class Teste {

	public static void main(String[] args) {
		
		Peixe a = new Peixe("Nemo", "Palhaço", "Glub");
		// a.comer(); //não é acessivel
		a.nadar();
	}
}
