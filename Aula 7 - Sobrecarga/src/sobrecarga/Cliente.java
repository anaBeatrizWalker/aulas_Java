package sobrecarga;

public class Cliente {
	private String nome, telefone;
	private int idade;
	
	//Assinatura do método: nome + lista de parâmetros
	
	//Cliente(String, String, int)
	public Cliente(String nome, String telefone, int idade) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
	}
	
	//Outro construtor diferenciado pelos parâmetros
	//Cliente(String, int)
	public Cliente(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public void mostrar() {
		System.out.println(nome);
		System.out.println(telefone);
		System.out.println(idade);
	}
}
