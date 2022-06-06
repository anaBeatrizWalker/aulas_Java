package umaPraN;

public class Produto {
	private String nome;
	private double preco;
	private boolean compra;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.compra = false;
	}

	public double getPreco() {
		return preco;
	}
	
	public boolean isCompra() {
		return compra;
	}
	
	public void marcarCompra() {
		compra = true;
	}
	
	public void desmarcarCompra() {
		compra = false;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
	}	
}
