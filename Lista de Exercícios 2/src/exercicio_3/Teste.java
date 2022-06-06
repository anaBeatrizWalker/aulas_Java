package exercicio_3;

public class Teste {

	public static void main(String[] args) {
		Bateria b = new Bateria(100);
		Celular c = new Celular(555, "Ana", b);
		c.ligar();
		c.desligar();
		
		//testando descarregamento
		c.ligar();
		c.ligar();
		c.ligar();
		c.ligar();
		c.ligar();
		c.ligar();
		c.ligar();
		c.ligar();

	}

}
