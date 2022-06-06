package permissaoPaginas;

public class TestePagina {

	public static void main(String[] args) {
		//Proxy escondeu as permissoes!!!
		Proxy p = new Proxy("root","root");
		p.admin();
		p.dashboard();
		p.principal();
	}

}
