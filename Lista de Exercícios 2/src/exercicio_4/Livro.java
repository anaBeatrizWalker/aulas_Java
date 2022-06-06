package exercicio_4;

public class Livro {
	private String livro;
	private String autor;
	
	public Livro(String livro, String autor) {
		this.livro = livro;
		this.autor = autor;
	}
	
	public void mostrar() {
		System.out.println("Livro: " + livro + ". Autor: " + autor);
	}
}
