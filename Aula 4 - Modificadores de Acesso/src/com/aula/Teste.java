package com.aula;

public class Teste {

	public static void main(String[] args) {
		Foo f = new Foo();
		f.x = 7; //Acessível escrita
		System.out.println(f.x); //Acessível leitura
		
		f.z = 10; //Acessível escrita pq estão no mesmo pacote
		System.out.println(f.z); //Acessível leitura
		
		//f.y = 8; //Não acessível pq está em outra classe
		f.algo(); //Acessível leitura
		f.setY(105); //Acessível escrita
	}
}
