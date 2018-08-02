package excecao;

public class RegistroNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 4752244517363003968L;

	public RegistroNaoEncontradoException(String msg) {
		super(msg);
	}
}
