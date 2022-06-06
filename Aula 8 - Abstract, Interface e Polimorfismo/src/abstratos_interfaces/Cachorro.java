package abstratos_interfaces;

//Extend somente 1, Implement pode vários
public class Cachorro extends Animal implements Pet{
	
	public Cachorro(String nome) {
		super(nome);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("AU AU");
	}
	
	@Override
	public void brincar() {
		System.out.println("Brincando com bolinha");
	}
}
