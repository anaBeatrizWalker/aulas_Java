package permissaoPaginas;

public class Admin implements Pagina{

	@Override
	public void principal() {
		System.out.println("Ola MONSTRO!");
	}

	@Override
	public void dashboard() {
		erro(403);
	}

	@Override
	public void admin() {
		System.out.println("Painel de admin");
	}

}
