package abstratos_interfaces;

public class Urso extends Animal implements SerVivo {

	public Urso(String nome) {
		super(nome);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("AU AU");
	}
	
	//SerVivo sem implementar Pet
	@Override
	public void respirar() {
		System.out.println("Respirando");
	}
}
