package primeiraClasse;

public class Cachorro {
	//Definir atributos
	String raca; //definir tipo do atributo
	String nome; //n�o pensar em valor, apenas em sua defini��o abstrata
	
	//Definir m�todos
	void latir() {
		//c = this => this.nome = c.nome (this � o objeto que chamou o m�todo)
		System.out.println(nome + ": AUAU");
	}
	void mostrarRaca() {
		//Syso ctrl + space
		System.out.println("Ra�a: " + raca);
	}
}
