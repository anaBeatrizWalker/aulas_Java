package exercicio_1;

public class Partido {
	private String nome, sigla;
	private int numero;
	private String ideologia;
	
	public Partido(String nome, String sigla, int numero, String ideologia){
		this.nome = nome;
		this.sigla = sigla;
		this.numero = numero;
		this.ideologia = ideologia;
	}
	
	public String getNome() {
		return nome;
	}
	public String getIdeologia() {
		return ideologia;
	}
	public String getSigla() {
		return sigla;
	}
	public int getNumero() {
		return numero;
	}

	public void mostrar() {
		System.out.println("Dados do Partido");
		System.out.println("Nome: " + nome);
		System.out.println("Sigla: " + sigla);
		System.out.println("Número: " + numero);
		System.out.println("Ideologia: " + ideologia);
	}
}
