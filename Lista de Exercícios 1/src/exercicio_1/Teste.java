package exercicio_1;

public class Teste {
	public static void main(String[] args) {
		
		Pessoa a = new Pessoa("Ana", "Fem", 12, false);
		Pessoa b = new Pessoa("Gustavo", "Masc", 21, true);
		Pessoa c = new Pessoa("Júlia", "Fem", 3, false);
		Pessoa d = new Pessoa("Isa", "Fem", 5, false);
		Pessoa e = new Pessoa("Cláudia", "Fem", 40, false);
		
		Churrasco sabado = new Churrasco();
		sabado.verificarConsumo(a); //Ana comeu 1.0 kg de carne.
		sabado.verificarConsumo(b); //Gustavo comeu 0.0 kg de carne.
		sabado.verificarConsumo(c); //Júlia comeu 0.0 kg de carne.
		sabado.verificarConsumo(d); //Isa comeu 1.0 kg de carne.
		sabado.verificarConsumo(e); //Cláudia comeu 2.0 kg de carne.
	}
}
