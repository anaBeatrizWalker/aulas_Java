package abstratos_interfaces;

public class Teste {

	public static void main(String[] args) {
		
		/*----------- Classes Abstratas -----------*/
		
		//Errado: Animal a = new Animal("Frajola")
		Gato g = new Gato("Frajola");
		g.emitirSom();
		
		//Errado: Quadrilatero q = new Quadrilatero(8);
		
		/*----------- Interfaces -----------*/
		
		Cachorro c = new Cachorro("Spike");
		c.brincar(); //Pet
		c.respirar(); //Pet > SerVivo
		
		/*----------- Polimorfismo -----------*/
		
		Animal a = new Cachorro("Spike");
		a.emitirSom();
		//a.brincar(); não tem acesso
		
		//Downcast: faz com que uma ref de uma subclasse se transforme em uma ref a uma subclasse
		((Cachorro) a).brincar();
		
		/*
		Classcat exception: não pode haver cast entre classes irmãs
		Gato g = (Gato) a;
		g.arranhar(); 
		*/
	}

}
