package permissaoPaginas;

public class Convidado implements Pagina{

	@Override
	public void principal() {
		System.out.println("Ol� convidada(o)");
	}

	@Override
	public void dashboard() {
		System.out.println("Fa�a login");
	}

	@Override
	public void admin() {
		System.out.println("Fa�a login");
	}

}
