package permissaoPaginas;

public class Convidado implements Pagina{

	@Override
	public void principal() {
		System.out.println("Olá convidada(o)");
	}

	@Override
	public void dashboard() {
		System.out.println("Faça login");
	}

	@Override
	public void admin() {
		System.out.println("Faça login");
	}

}
