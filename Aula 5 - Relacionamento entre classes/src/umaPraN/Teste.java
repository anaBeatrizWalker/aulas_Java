package umaPraN;

public class Teste {

	public static void main(String[] args) {
		Produto a = new Produto("Caneta", 1.50);
		Produto b = new Produto("Lápis", 2.50);
		Produto c = new Produto("Borracha", 0.50);
		Produto d = new Produto("Caderno", 10.99);
		
		a.marcarCompra();
		c.marcarCompra();
		d.marcarCompra();
		
		Carrinho c1 = new Carrinho("Ana Beatriz");
		c1.adicionar(a);
		c1.adicionar(c);
		c1.adicionar(d);
		c1.listar();
		System.out.println("Total a pagar: " + c1.gerarTotal());
		c1.listarComprados();
		System.out.println("Total da compra: " + c1.gerarTotalCompra()  );
	}
}
