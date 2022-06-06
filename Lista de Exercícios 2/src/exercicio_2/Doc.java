package exercicio_2;

public class Doc {
	private Cliente c1;
	private Cliente c2;
	private double quantia;
	
	public Doc(Cliente c1, Cliente c2, double quantia){
		this.c1 = c1;
		this.c2 = c2;
		this.quantia = quantia;
	}
	
	public Cliente getC1() {
		return c1;
	}
	public Cliente getC2() {
		return c2;
	}
	public double getQuantia() {
		return quantia;
	}
	
	public void tranferir(Cliente c1, Cliente c2, double quantia) {
		if(c1.checarSaldo() >= quantia) {
			c1.sacar(quantia);
			c2.depositar(quantia);
			System.out.println("Dados da tranferênica:");
			System.out.println("Quantia: " + quantia);
			c1.mostrarSaldo();
			c2.mostrarSaldo();
		}else {
			System.out.println("Saldo indisponível para transferência");
		}
	}
}
