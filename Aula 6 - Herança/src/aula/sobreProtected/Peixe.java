package aula.sobreProtected;

import aula.herança.Animal;

public class Peixe extends Animal{
	
	public Peixe(String nome, String especie, String som) {
		super(nome, especie, som);
	}
	
	public void nadar() {
		this.comer(); //tem acesso por causa do this
	}
	/*
	public void algo(Animal a) {
		a.comer(); //não é acessivel para qualquer outra referencia
	}
	*/
}
