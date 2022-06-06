package primeiraClasse;

public class Cachorro {
	//Definir atributos
	String raca; //definir tipo do atributo
	String nome; //não pensar em valor, apenas em sua definição abstrata
	
	//Definir métodos
	void latir() {
		//c = this => this.nome = c.nome (this é o objeto que chamou o método)
		System.out.println(nome + ": AUAU");
	}
	void mostrarRaca() {
		//Syso ctrl + space
		System.out.println("Raça: " + raca);
	}
}
