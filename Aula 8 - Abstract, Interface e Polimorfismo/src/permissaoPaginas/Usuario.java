package permissaoPaginas;

public class Usuario implements Pagina{

	@Override
	public void principal() {
		System.out.println("Ola usuario");
	}

	@Override
	public void dashboard() {
		System.out.println("Opçoes para usuario");
	}

	@Override
	public void admin() {
		System.out.println("Proibido!");
		erro(403);
	}

}
