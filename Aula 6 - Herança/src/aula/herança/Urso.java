package aula.herança;

public class Urso extends Animal{
	
	public Urso(String nome, String especie, String som) {
		super(nome, especie, som);
	}
	
	public void mostrar() {
		System.out.println("Nome: " + getNome());
		System.out.println("Espécie: " + getEspecie());
		System.out.println("Som: " + getSom());
	}
}
