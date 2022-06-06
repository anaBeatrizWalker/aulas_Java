package abstratos_interfaces;

public class Gato extends Animal implements Pet{
	
	public Gato(String nome) {
		super(nome);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Meow meow");
	}
	
	@Override
	public void brincar() {
		System.out.println("Brincando com miolo de lã");
	}
	
	public void arranhar() {
		System.out.println("Arranhando");
	}
}
