package umaPraN;

import java.util.ArrayList;

public class Carrinho {
	
	private String nomeCliente;
	private ArrayList<Produto> produtos; //Um carrinho tem várias refs de produtos
	
	public Carrinho(String nomeCliente){ //construtor só com o atributo próprio da classe
		this.nomeCliente = nomeCliente;
		this.produtos = new ArrayList<Produto>(); //inicializando um novo array
	}
	public void adicionar(Produto p) {
		produtos.add(p);
	}
	
	public void remover(Produto p) {
		produtos.remove(p);
	}
	
	public void atualizar(int indice, Produto novo) {
		produtos.set(indice, novo);
	}
	
	public void listar() {
		System.out.println("Cliente: " + nomeCliente);
		//for convencional:
		/*for(int i=0; i < produtos.size, i++){
			produtos.get(i).mostrarDados();
		}*/
		
		//for in:
		for(Produto p : produtos) {//pra cada produto in produtos
			p.mostrarDados();
		} 
	}
	
	public void listarComprados() {
		for(Produto p : produtos) {
			if(p.isCompra()){
				p.mostrarDados();
			}
		}
	}
	
	public void atuailizar(int indice, Produto novo) {
		produtos.set(indice, novo);
	}
	
	public double gerarTotal() {
		double soma = 0;
		for(Produto p : produtos) {
			soma = soma + p.getPreco();
		}
		return soma;
	}
	
	public double gerarTotalCompra() {
		double soma = 0;
		for(Produto p : produtos) {
			if(p.isCompra())
				soma = soma + p.getPreco();
		}
		return soma;
	}
}
