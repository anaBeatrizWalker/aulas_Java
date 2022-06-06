package exercicio_1;

public class Churrasco {
	
	double qtdCarne;
	
	void verificarConsumo(Pessoa pessoa) {
		if(pessoa.idade <= 3 || pessoa.vegetariana == true) {
			qtdCarne = 0;
		} else if(pessoa.idade >= 4 && pessoa.idade <= 12) {
			qtdCarne = 1;
		} else {
			qtdCarne = 2;
		}
		System.out.println(pessoa.nome + " comeu " + qtdCarne + " kg de carne.");
	}
}