package primeiraClasse;

public class Quadrado {
	
	double lado;

	//Construtor explícito
	Quadrado(double lado){
		//não pode colocar lado = lado
		//neste caso o this foi usado para resolver uma ambiguidade
		//atributo = local
		this.lado = lado;
	}
	
	double calcularPerim() {
		return 4*lado;
	}
	
	double calcularArea() {
		return Math.pow(lado, 2);
	}
	
	void mostrar() {
		System.out.println(lado);
	}
}
