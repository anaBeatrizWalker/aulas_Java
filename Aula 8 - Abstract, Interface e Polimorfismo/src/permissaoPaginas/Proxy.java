package permissaoPaginas;

public class Proxy implements Pagina{
	
	private Pagina pagina;
	
	//CONEXAO O BD
	public Proxy(String login, String senha) {
		if(login.contentEquals("root") && senha.contentEquals("root")) {
			pagina = new Admin();
		}else if(login.contentEquals("user") && senha.contentEquals("1236")) {
			pagina = new Usuario();
		}else {
			pagina = new Convidado();
		}
	}

	@Override
	public void principal() {
		pagina.principal();
	}

	@Override
	public void dashboard() {
		pagina.dashboard();
	}

	@Override
	public void admin() {
		pagina.admin();
	}
	
	
	
}
