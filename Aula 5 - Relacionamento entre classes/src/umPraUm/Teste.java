package umPraUm;

public class Teste {

	public static void main(String[] args) {
		Endereco end = new Endereco("11111-111", "Rua Tralalá", "Santos", Estados.SP);
		
		Aluno a =  new Aluno("Ana", "0050832021035", end);
		a.mostrarDados();
	}
}
