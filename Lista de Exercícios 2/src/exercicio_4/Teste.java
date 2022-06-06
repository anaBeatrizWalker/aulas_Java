package exercicio_4;

public class Teste {

	public static void main(String[] args) {
		Livro a = new Livro("Exemplo", "Ana");
		Formato f = new Formato(20, "Ebook", true, a);
		f.mostrar();
	}
}
