package primeiraClasse;

public class Teste {

	public static void main(String[] args) {
		//Definir objetos (ponto de partida)
		Cachorro c = new Cachorro();
		c.nome = "Thobias"; 
		c.raca = "Vira-lata";
		c.latir();
		c.mostrarRaca();
		
		Cachorro d = new Cachorro();
		d.nome = "Rex";
		d.raca = "Pitbull";
		d.latir();
		d.mostrarRaca();
		
		Contador p = new Contador();
		p.numPessoas = 50; //linha feia
		p.incrementar(); //51
		p.decrementar(); //50
		p.mostrar(); //50
		p.zerar(); //0
		p.decrementar(); //0
		
		Contador n = new Contador();
		n.mostrar(); //default começa em 0
		
		Quadrado q = new Quadrado(5);
		//q.lado = 5;  => linha feia
		//this.lado = 5; => por causa do construtor
		System.out.println("Área = " + q.calcularArea()); //quando o método tem retorno, precisa sar syso
		System.out.println("Perímetro = " + q.calcularPerim());
	}
}