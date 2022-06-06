package primeiraClasse;
/*Um contador nos permite contar o número de pessoas em um recinto. O número de
pessoas é sempre maior zero.O contador possui quatro funcionalidade:
zerar, incrementar, decrementar e mostrar.*/

public class Contador {
	//Atributo
	int numPessoas;
	
	//Métodos
	void mostrar() {
		System.out.println("Número de pessoas: " + numPessoas);
	}
	void zerar() {
		numPessoas = 0;
		mostrar();
	}
	void incrementar() {
		numPessoas = numPessoas + 1;
		mostrar();
	}
	void decrementar() {
		if (numPessoas > 0) //if com uma linha só não precisa de { }
			numPessoas = numPessoas - 1;
		mostrar();
	}
}