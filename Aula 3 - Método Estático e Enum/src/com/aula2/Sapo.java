package com.aula2;

public class Sapo {
	
	int qtPulo;
	/*Um membro (m�todo ou atributo) est�tico � aquele que est� 
	desacoplado da inst�ncia. Vive em uma classe e n�o em um 
	objeto. Torna o membro com escopo global a todos os objetos*/
	static int qtSapo;
	
	Sapo(){ //esse construtor poderia ser um m�todo
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
		System.out.println("M�TODO PARA TODOS OS SAPOS");
	}
	
	/*Um m�todo estatico n�o pode manipular um atributo 
	n�o est�tico
	
	static void algo(){
		qtPulo++;
	}*/
}
