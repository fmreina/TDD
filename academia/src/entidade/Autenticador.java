package entidade;

import entidadeImpl.Funcionario;

public interface Autenticador {

	boolean autenticarUsuario(Funcionario funcionario, String usuario, String senha);

}
