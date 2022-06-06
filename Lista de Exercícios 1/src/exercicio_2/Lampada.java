package exercicio_2;

public class Lampada {
	String status = "off";
	static int qtdClicks;
	
	void clicked() {
		
		qtdClicks++;
		
		if(status == "on") {
			status = "off";
			System.out.println("Você apagou a lâmpada.");
			
		}else if(status == "off") {
			status = "on";
			System.out.println("Você acendeu a lâmpada.");
		}
		if(qtdClicks >= 3) {
			status = "off";
			System.out.println("A lâmpada quebrou porque você clicou demais!");
		}
	}	
}
