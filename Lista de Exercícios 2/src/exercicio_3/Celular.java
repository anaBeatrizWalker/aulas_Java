package exercicio_3;

public class Celular {
	private int id;
	private String usuario;
	Bateria bateria;
	
	public Celular(int id, String usuario, Bateria bateria){
		this.id = id;
		this.usuario = usuario;
		this.bateria = bateria;
	}
	
	public int getId() {
		return id;
	}
	public String getUsuario() {
		return usuario;
	}
	public Bateria getBateria() {
		return bateria;
	}
	
	public void ligar() {
		if(bateria.getCarga() > 20) {
			bateria.descarrega();
			System.out.println("Olá " + usuario + ". Celular " + id + ". Bateria em ");
			bateria.mostrar();
		}else {
			System.out.println("Bateria fraca, desligando...");
		}
	}
	
	public void desligar() {
		System.out.println("Até a próxima " + usuario);
	}
}
