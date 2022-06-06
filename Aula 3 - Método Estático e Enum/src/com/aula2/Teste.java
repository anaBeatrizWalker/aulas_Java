package com.aula2;

public class Teste {

	public static void main(String[] args) {
		Aluno a = new Aluno("Ana Beatriz", Curso.SISTEMAS_PARA_INTERNET);
		a.mostrar();
		
		//O método ordinal é a numeração que toda enum possui
		System.out.println(Curso.SISTEMAS_PARA_INTERNET.ordinal());
		
		Sapo s1 = new Sapo();
		s1.pular();
		s1.mostrar();
		
		Sapo s2 = new Sapo();
		s2.pular();
		s2.pular();
		s2.mostrar();
		
		Sapo s3 = new Sapo();
		s3.pular();
		s3.mostrar(); 
		
		Sapo s4 = new Sapo();
		s4.mostrar();
		
		Sapo s5 = new Sapo();	
		Sapo s6 = new Sapo();
		Sapo s7 = new Sapo();
		Sapo s8 = new Sapo();
		s5.mostrar(); //total de sapos
		
		Sapo.sapear();
	}
}
