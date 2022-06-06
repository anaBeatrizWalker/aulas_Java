package aula.herança;

public class Animal {
	private String nome, especie, som;
	
	public Animal(String nome, String especie, String som) {
		this.nome = nome;
		this.especie = especie;
		this.som = som;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public String getSom() {
		return som;
	}
	
	public void dormir() {
		System.out.println("ZZZzzzZZZzzz...");
	}
	
	protected void comer() {
		System.out.println(nome + " está comendo.");
	}
	
	public void ataque(Animal a) {
		System.out.println(a.nome);
	}
}
