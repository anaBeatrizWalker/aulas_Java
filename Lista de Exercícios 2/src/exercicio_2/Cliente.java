package exercicio_2;

public class Cliente {
	private String nome;
	private double saldo, limite;
	
	public Cliente(String nome, double saldo, double limite){
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public String getNome() {
		return nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public double getLimite() {
		return limite;
	}
	
	public  void depositar(double valor) {
		saldo = saldo + valor;
	}
	public void sacar(double valor) {
		if(valor >= saldo) {
			saldo = saldo - valor;
		}else {
			System.out.println("Saldo indisponível para saque");
		}
	}
	public double checarSaldo() {
		return saldo + limite;
	}
	public void mostrarSaldo() {
		System.out.println("Saldo atual de " + nome + " : " + checarSaldo());
	}
}
