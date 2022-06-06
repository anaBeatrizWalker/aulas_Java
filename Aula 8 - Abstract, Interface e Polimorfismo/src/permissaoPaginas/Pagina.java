package permissaoPaginas;

public interface Pagina {
	
	// /
	void principal();
	
	// /perfil
	void dashboard();
	
	// /erro
	default void erro(int erro) {
		System.out.println("A pagina de erro - " + erro);
	}
	
	// /admin
	void admin();
}
