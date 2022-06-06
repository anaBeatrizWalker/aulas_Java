package sobrescrita;

public class Teste {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.emitirSom();
		
		Cachorro c = new Cachorro();
		c.emitirSom();
		
		Gato g = new Gato();
		g.emitirSom();
		
		Retangulo r = new Retangulo(3,4);
		System.out.println(r.calcPerim());
		System.out.println(r.calcArea());
	}
}
