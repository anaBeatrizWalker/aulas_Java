package exercicio_7;

public class Teste {

	public static void main(String[] args) {
		Porta a = new Porta();
		a.abrir(); //N�mero de aberturas: 1
		a.fechar();
		a.abrir(); //N�mero de aberturas: 2
		a.fechar();
		a.abrir(); //N�mero de aberturas: 3
		
		Porta b = new Porta();
		b.abrir(); //N�mero de aberturas: 4
	}
}
