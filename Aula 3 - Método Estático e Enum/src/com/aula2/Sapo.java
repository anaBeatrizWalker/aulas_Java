package com.aula2;

public class Sapo {
	
	int qtPulo;
	/*Um membro (método ou atributo) estático é aquele que está 
	desacoplado da instância. Vive em uma classe e não em um 
	objeto. Torna o membro com escopo global a todos os objetos*/
	static int qtSapo;
	
	Sapo(){ //esse construtor poderia ser um método
		qtSapo++;
	}
	
	void pular() {
		qtPulo++;
	}
	
	void mostrar() {
		System.out.println("Pulos: " + qtPulo);
		System.out.println("Sapos: " + qtSapo);
	}
	
	static void sapear() {
		System.out.println("MÉTODO PARA TODOS OS SAPOS");
	}
	
	/*Um método estatico não pode manipular um atributo 
	não estático
	
	static void algo(){
		qtPulo++;
	}*/
}
