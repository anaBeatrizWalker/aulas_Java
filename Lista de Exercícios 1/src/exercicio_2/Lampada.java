package exercicio_2;

public class Lampada {
	String status = "off";
	static int qtdClicks;
	
	void clicked() {
		
		qtdClicks++;
		
		if(status == "on") {
			status = "off";
			System.out.println("Voc� apagou a l�mpada.");
			
		}else if(status == "off") {
			status = "on";
			System.out.println("Voc� acendeu a l�mpada.");
		}
		if(qtdClicks >= 3) {
			status = "off";
			System.out.println("A l�mpada quebrou porque voc� clicou demais!");
		}
	}	
}
