package aula.sobreProtected;

import aula.heran�a.Animal;

public class Peixe extends Animal{
	
	public Peixe(String nome, String especie, String som) {
		super(nome, especie, som);
	}
	
	public void nadar() {
		this.comer(); //tem acesso por causa do this
	}
	/*
	public void algo(Animal a) {
		a.comer(); //n�o � acessivel para qualquer outra referencia
	}
	*/
}
