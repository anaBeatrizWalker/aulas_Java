package com.aula2;

public class Aluno {
	String nome;
	Curso curso; //se comporta como string e com numeração como se fosse índices ao mesmo tempo
	
	Aluno(String nome, Curso curso){
		this.nome = nome;
		this.curso = curso;
	}
	
	void tratarNomes() {
		String curso = ""; //não é o mesmo que this.curso 
		switch (this.curso) {
			case SISTEMAS_PARA_INTERNET:
				curso = "Sistemas Para Internet";
				break;
			case ANALISE_DESENVOLVIMENTO_SISTEMAS:
				curso = "Análise e Desenvolvimento de Sistemas";
				break;
			case GESTAO_EMPRESARIAL:
				curso = "Gestão Empresarial";
				break;
			case CIENCIA_DE_DADOS:
				curso = "Ciência de Dados";
				break;
			case LOGISTICA:
				curso = "Logística";
				break;
			case RECURSOS_HUMANOS:
				curso = "Gestão de Recursos Humanos";
				break;
			case GESTAO_PORTUARIA:
				curso = "Gestão Portuária";
				break;
		}
		System.out.println("Curso: " + curso);
	}
	
	void mostrar() {
		System.out.println("Aluno: " + nome);
		tratarNomes();
	}
}
