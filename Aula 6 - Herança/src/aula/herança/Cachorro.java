package aula.herança;

public class Cachorro extends Animal {
	
	private String raça;
	
	//Se Animal tiver construtor Cachorro precisa ter também
	public Cachorro(String nome, String especie, String som, String raça) {
		//invoce o construtor da superclasse (classe superior)
		super(nome, especie, som);
		
		this.raça = raça;
	}
	
	public void mostrar() {
		System.out.println("Nome: " + getNome()); //ou super.getNome()
		System.out.println("Espécie: " + getEspecie());
		System.out.println("Raça: " + raça);
		System.out.println("Som: " + getSom());
	}
	
	//Cachorro tem acesso a dormir()
}
