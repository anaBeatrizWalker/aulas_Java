package com.aula.pacote2;

import com.aula.Foo;

public class Teste {

	public static void main(String[] args) {
		Foo f = new Foo();
		f.x = 7; //Acess�vel escrita
		System.out.println(f.x); //Acess�vel leitura
		
		//f.z = 10; //N�o acess�vel pq n�o est� no mesmo pacote
		//System.out.println(f.z); //N�o acess�vel
		
		//f.y = 8; //N�o acess�vel pq est� em outra classe
	}
}
