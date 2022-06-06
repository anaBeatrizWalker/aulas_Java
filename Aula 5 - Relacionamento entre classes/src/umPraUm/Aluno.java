package umPraUm;

/*Rela��o de 1 para 1: dentro da classe Aluno podemos acessar
tudo de publico que tem na classe Endere�o */

//Aluno has-a Endereco = Aluno TEM UM Endereco
public class Aluno {
	
	private String nome, ra;
	//Classe Aluno possui uma refer�ncia da classe Endere�o
	private Endereco endereco;
	
	public Aluno(String nome, String ra, Endereco endereco) {
		this.nome = nome;
		this.ra = ra;
		this.endereco = endereco;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("RA: " + ra);
		endereco.mostrarDados(); //usa o m�todo da classe Endere�o na classe Aluno
	}
}
