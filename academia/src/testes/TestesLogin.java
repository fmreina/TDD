package testes;

import static org.junit.Assert.assertTrue;
import static tipo.TipoCargo.TREINADOR;

import org.junit.Before;
import org.junit.Test;

import controle.Academia;
import entidadeImpl.Funcionario;
import excecao.UsuarioOuSenhaInvalidosException;

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

	@Test
	public void testeAutenticarUsuarioValido() {
		boolean autenticacao = this.academia.autenticarUsuario(this.lusca, "lusca", "1234");
		assertTrue(autenticacao);
	}

	@Test(expected = UsuarioOuSenhaInvalidosException.class)
	public void testeAutenticarUsuarioInvalido() {
		boolean autenticacao = this.academia.autenticarUsuario(this.lusca, "lucas", "1234");
		assertTrue(autenticacao);
	}

	@Test(expected = UsuarioOuSenhaInvalidosException.class)
	public void testeAutenticarSenhaInvalida() {
		boolean autenticacao = this.academia.autenticarUsuario(this.lusca, "lusca", "4321");
		assertTrue(autenticacao);
	}
}
