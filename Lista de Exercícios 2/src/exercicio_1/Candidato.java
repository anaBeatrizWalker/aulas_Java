package exercicio_1;

public class Candidato {
	private String nome;
	Partido partido;
	
	public Candidato(String nome, Partido partido){
		this.nome = nome;
		this.partido = partido;
	}
	
	public void mostrar() {
		System.out.println("Candidato " + nome);
		partido.mostrar();
	}
}
