package abstratos_interfaces;

//Classe abstrata
abstract class Animal {
	
	private String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void comer() {
		System.out.println("Comendo...");
	}
	
	public void dormir() {
		System.out.println("ZZzzZZ...");
	}
	
	//M�todo abstrato, pois n�o faz sentido ter c�digo
	public abstract void emitirSom();
	/*{
		System.out.println("Som gen�rico...");
	}*/
}
