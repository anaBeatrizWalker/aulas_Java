package aula.herança;

public class Teste {

	public static void main(String[] args) {
		Animal a = new Animal("nome", "especie", "som");
		a.dormir();
		
		Cachorro c = new Cachorro("Thobias", "Cachorro", "AU AU", "Vira-lata");
		//System.out.println(c.getNome()); //herança
		c.mostrar();
		
		Urso u = new Urso("Pooh", "Urso pardo", "RUUUR");
		u.mostrar();
		
		//instanceof 
		System.out.println();
		System.out.println(u instanceof Urso); //true
		System.out.println(u instanceof Animal); //true
		System.out.println(u instanceof Object); //true
		System.out.println(a instanceof Cachorro); //false		
	}
}
