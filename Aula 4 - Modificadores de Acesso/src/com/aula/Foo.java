package com.aula;

public class Foo {
	public int x;
	private int y;
	int z; //default
	
	public void algo() {
		this.y = 5; //Acess�vel escrita pq est� na mesma classe
		System.out.println(y); //Acess�vel leitura pq est� na mesma classe
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
