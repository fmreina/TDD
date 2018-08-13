package entidadeImpl;

import entidade.Autenticador;
import excecao.UsuarioOuSenhaInvalidosException;

public class AutenticadorImpl implements Autenticador {

	@Override
	public boolean autenticarUsuario(Funcionario funcionario, String usuario, String senha) throws UsuarioOuSenhaInvalidosException {
		if (funcionario.getUsuario() == null) {
			throw new UsuarioOuSenhaInvalidosException("Usuário ou senha inválidos!");
		}
		if (!funcionario.getUsuario().equals(usuario) || !funcionario.getSenha().equals(senha)) {
			throw new UsuarioOuSenhaInvalidosException("Usuário ou senha inválidos!");
		}
		return true;
	}

}
