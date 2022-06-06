package primeiraClasse;
/*Um contador nos permite contar o n�mero de pessoas em um recinto. O n�mero de
pessoas � sempre maior zero.O contador possui quatro funcionalidade:
zerar, incrementar, decrementar e mostrar.*/

public class Contador {
	//Atributo
	int numPessoas;
	
	//M�todos
	void mostrar() {
		System.out.println("N�mero de pessoas: " + numPessoas);
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
		if (numPessoas > 0) //if com uma linha s� n�o precisa de { }
			numPessoas = numPessoas - 1;
		mostrar();
	}
}