package com.aula2;

public class Aluno {
	String nome;
	Curso curso; //se comporta como string e com numera��o como se fosse �ndices ao mesmo tempo
	
	Aluno(String nome, Curso curso){
		this.nome = nome;
		this.curso = curso;
	}
	
	void tratarNomes() {
		String curso = ""; //n�o � o mesmo que this.curso 
		switch (this.curso) {
			case SISTEMAS_PARA_INTERNET:
				curso = "Sistemas Para Internet";
				break;
			case ANALISE_DESENVOLVIMENTO_SISTEMAS:
				curso = "An�lise e Desenvolvimento de Sistemas";
				break;
			case GESTAO_EMPRESARIAL:
				curso = "Gest�o Empresarial";
				break;
			case CIENCIA_DE_DADOS:
				curso = "Ci�ncia de Dados";
				break;
			case LOGISTICA:
				curso = "Log�stica";
				break;
			case RECURSOS_HUMANOS:
				curso = "Gest�o de Recursos Humanos";
				break;
			case GESTAO_PORTUARIA:
				curso = "Gest�o Portu�ria";
				break;
		}
		System.out.println("Curso: " + curso);
	}
	
	void mostrar() {
		System.out.println("Aluno: " + nome);
		tratarNomes();
	}
}
