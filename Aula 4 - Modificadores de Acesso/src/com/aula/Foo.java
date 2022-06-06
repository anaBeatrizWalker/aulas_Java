package com.aula;

public class Foo {
	public int x;
	private int y;
	int z; //default
	
	public void algo() {
		this.y = 5; //Acessível escrita pq está na mesma classe
		System.out.println(y); //Acessível leitura pq está na mesma classe
	}
	
	//Dando acesso de leitura ao y
	public int getY() {
		return y;
	}
	
	//Dando acesso de escrita
	public void setY(int y) {
		this.y = y;
	}
}
