package testes;

import static tipo.TipoCargo.TREINADOR;

import org.junit.Before;

import controle.Academia;
import entidadeImpl.Funcionario;

public class TestesLogin {

	private Academia academia;
	private Funcionario lusca;

	@Before
	public void before() {
		this.academia = new Academia();
		this.lusca = new Funcionario("Lusca", "12345678903", TREINADOR);
		this.lusca.setUsuario("lusca");
		this.lusca.setSenha("1234");
	}

	// @Test
	// public void testeAutenticarUsuarioValido() throws UsuarioOuSenhaInvalidosException {
	// boolean autenticacao = this.academia.autenticarUsuario("lusca", "1234");
	// assertTrue(autenticacao);
	// }
	//
	// @Test(expected = UsuarioOuSenhaInvalidosException.class)
	// public void testeAutenticarUsuarioInvalido() throws UsuarioOuSenhaInvalidosException {
	// boolean autenticacao = this.academia.autenticarUsuario("lucas", "1234");
	// assertTrue(autenticacao);
	// }
	//
	// @Test(expected = UsuarioOuSenhaInvalidosException.class)
	// public void testeAutenticarSenhaInvalida() throws UsuarioOuSenhaInvalidosException {
	// boolean autenticacao = this.academia.autenticarUsuario("lusca", "4321");
	// assertTrue(autenticacao);
	// }
}
