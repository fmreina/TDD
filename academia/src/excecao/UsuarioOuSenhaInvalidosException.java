package excecao;

public class UsuarioOuSenhaInvalidosException extends RuntimeException {

	private static final long serialVersionUID = -933736251835246207L;

	public UsuarioOuSenhaInvalidosException(String msg) {
		super(msg);
	}

}
