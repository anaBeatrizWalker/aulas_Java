package sobrescrita;

public class Gato extends Animal{
	@Override
	public void emitirSom() {
		System.out.println("Meow meow");
	}
}
