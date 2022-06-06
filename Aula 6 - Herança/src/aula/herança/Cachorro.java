package aula.heran�a;

public class Cachorro extends Animal {
	
	private String ra�a;
	
	//Se Animal tiver construtor Cachorro precisa ter tamb�m
	public Cachorro(String nome, String especie, String som, String ra�a) {
		//invoce o construtor da superclasse (classe superior)
		super(nome, especie, som);
		
		this.ra�a = ra�a;
	}
	
	public void mostrar() {
		System.out.println("Nome: " + getNome()); //ou super.getNome()
		System.out.println("Esp�cie: " + getEspecie());
		System.out.println("Ra�a: " + ra�a);
		System.out.println("Som: " + getSom());
	}
	
	//Cachorro tem acesso a dormir()
}
