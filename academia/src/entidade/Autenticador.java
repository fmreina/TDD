package entidade;

import entidadeImpl.Funcionario;
import excecao.UsuarioOuSenhaInvalidosException;

public interface Autenticador {

	boolean autenticarUsuario(Funcionario funcionario, String usuario, String senha) throws UsuarioOuSenhaInvalidosException;

}
