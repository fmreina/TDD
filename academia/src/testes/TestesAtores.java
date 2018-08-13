package testes;

import static tipo.TipoCargo.ADM;
import static tipo.TipoCargo.TREINADOR;

import org.junit.Before;

import controle.Academia;
import entidadeImpl.Aluno;
import entidadeImpl.Funcionario;

public class TestesAtores {

	private Academia academia;
	private Aluno fabio, maria, fabio2;
	private Funcionario lusca, ferrugem;

	@Before
	public void before() {
		this.academia = new Academia();
		this.fabio = new Aluno("Fabio", "12345678901");
		this.maria = new Aluno("Maria", "12345678902");
		this.lusca = new Funcionario("Lusca", "12345678903", TREINADOR);
		this.ferrugem = new Funcionario("Ferrugem", "12345678904", ADM);
		this.fabio2 = new Aluno("Fabio", "12345678905");
	}

	// @Test
	// public void testeAluno() {
	// assertEquals("Fabio, 12345678901", this.fabio.toString());
	// }
	//
	// @Test
	// public void testeAlunoIgual() {
	// assertNotEquals(this.fabio, this.maria);
	// }
	//
	// @Test
	// public void testeCadastrarAluno() {
	// this.academia.cadastraAluno(this.maria);
	// assertEquals(1, this.academia.getAlunos().size());
	// }
	//
	// @Test(expected = RegistroJaCadastradoException.class)
	// public void testeCadastrarAlunoRepetido() throws Exception {
	// this.academia.cadastraAluno(this.fabio);
	// this.academia.cadastraAluno(new Aluno("Lusca", "12345678901"));
	// }
	//
	// @Test
	// public void testeFuncionarioTreinador() {
	// assertEquals("Lusca, 12345678903", this.lusca.toString());
	// assertEquals(TREINADOR, this.lusca.getCargo());
	// }
	//
	// @Test
	// public void testeFuncionarioIgual() {
	// assertNotEquals(this.ferrugem, this.lusca);
	// }
	//
	// @Test
	// public void testeCadastrarFuncionario() {
	// this.academia.cadastraFuncionario(this.lusca);
	// assertEquals(1, this.academia.getFuncionarios().size());
	// }
	//
	// @Test(expected = RegistroJaCadastradoException.class)
	// public void testeCadastrarFuncionarioRepetido() throws Exception {
	// this.academia.cadastraFuncionario(this.lusca);
	// this.academia.cadastraFuncionario(new Funcionario("Jake", "12345678903", ADM));
	// }
	//
	// @Test
	// public void testeBuscaAlunoPorNome() {
	// String nome = "Fabio";
	// this.academia.cadastraAluno(this.fabio);
	// this.academia.cadastraAluno(this.fabio2);
	// this.academia.cadastraAluno(this.maria);
	// List<Aluno> alunos = this.academia.buscaAlunoPorNome(nome);
	// alunos.forEach(a -> {
	// assertEquals(nome, a.getNome());
	// // System.out.println(a.toString());
	// });
	// }
	//
	// @Test(expected = RegistroNaoEncontradoException.class)
	// public void testeBuscaAlunoPorNomeNaoEncontrado() {
	// this.academia.buscaAlunoPorNome("Fabio");
	// }
	//
	// @Test
	// public void testeBuscaAlunoPorCpf() {
	// String cpf = "12345678902";
	// this.academia.cadastraAluno(this.fabio);
	// this.academia.cadastraAluno(this.fabio2);
	// this.academia.cadastraAluno(this.maria);
	// List<Aluno> alunos = this.academia.buscaAlunoPorCpf(cpf);
	// alunos.forEach(a -> {
	// assertEquals(cpf, a.getCpf());
	// // System.out.println(a.toString());
	// });
	// }
	//
	// @Test(expected = RegistroNaoEncontradoException.class)
	// public void testeBuscaAlunoPorCpfNaoEncontrado() {
	// this.academia.buscaAlunoPorCpf("12345678902");
	// }

	// @Test
	// public void testeAlunoTemMatricula(){
	// }
}
