package umPraUm;

public class Endereco {
	
	private String cep, logradouro, cidade;
	private Estados estado;
	
	public Endereco(String cep, String logradouro, String cidade, Estados estado) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public void mostrarDados() {
		System.out.println("Cep: " + cep);
		System.out.println("Logradouro: " + logradouro);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado);
	}
}
