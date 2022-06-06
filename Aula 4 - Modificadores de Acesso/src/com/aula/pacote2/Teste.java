package com.aula.pacote2;

import com.aula.Foo;

public class Teste {

	public static void main(String[] args) {
		Foo f = new Foo();
		f.x = 7; //Acessível escrita
		System.out.println(f.x); //Acessível leitura
		
		//f.z = 10; //Não acessível pq não está no mesmo pacote
		//System.out.println(f.z); //Não acessível
		
		//f.y = 8; //Não acessível pq está em outra classe
	}
}
