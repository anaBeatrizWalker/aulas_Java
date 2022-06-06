package exercicio_4;

public class Formato {
	private double preco;
	private String tipo;
	private boolean disponivel;
	private Livro livro;
	
	public Formato(double preco, String tipo, boolean disponivel, Livro livro) {
		this.preco = preco;
		this.tipo = tipo;
		this.disponivel = disponivel;
		this.livro = livro;
	}

	public double getPreco() {
		return preco;
	}
	public String getTipo() {
		return tipo;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public Livro getLivro() {
		return livro;
	}
	
	public void mostrar() {
		if(disponivel) {
			System.out.println("Preço: " + preco + ". Tipo: " + tipo);
			livro.mostrar();
		}
	}
}
