package com.aula;

public class Teste {

	public static void main(String[] args) {
		Foo f = new Foo();
		f.x = 7; //Acess�vel escrita
		System.out.println(f.x); //Acess�vel leitura
		
		f.z = 10; //Acess�vel escrita pq est�o no mesmo pacote
		System.out.println(f.z); //Acess�vel leitura
		
		//f.y = 8; //N�o acess�vel pq est� em outra classe
		f.algo(); //Acess�vel leitura
		f.setY(105); //Acess�vel escrita
	}
}
