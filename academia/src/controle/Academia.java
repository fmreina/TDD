package controle;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import entidade.Autenticador;
import entidadeImpl.Aluno;
import entidadeImpl.AutenticadorImpl;
import entidadeImpl.Funcionario;
import excecao.RegistroJaCadastradoException;
import excecao.RegistroNaoEncontradoException;

public class Academia {

	private Map<String, Funcionario> Funcionarios = new LinkedHashMap<>();
	private Map<String, Aluno> alunos = new LinkedHashMap<>();

	public void cadastraAluno(Aluno aluno) {
		if (this.alunos.values().contains(aluno)) {
			throw new RegistroJaCadastradoException(String.format("o CPF %s já está cadastrado no sistema.", aluno.getCpf()));
		}
		this.alunos.put(aluno.getCpf(), aluno);
	}

	public void cadastraFuncionario(Funcionario funcionario) {
		if (this.Funcionarios.values().contains(funcionario)) {
			throw new RegistroJaCadastradoException(String.format("o CPF %s já está cadastrado no sistema.", funcionario.getCpf()));
		}
		this.Funcionarios.put(funcionario.getCpf(), funcionario);
	}

	public Map<String, Aluno> getAlunos() {
		return this.alunos;
	}

	public Map<String, Funcionario> getFuncionarios() {
		return this.Funcionarios;
	}

	public List<Aluno> buscaAlunoPorNome(String nome) {
		List<Aluno> filtro = this.alunos.values().stream().filter(a -> a.getNome().equals(nome)).collect(Collectors.toList());
		if (filtro.isEmpty()) {
			throw new RegistroNaoEncontradoException(String.format("Não foi possível encontrar um aluno com o nome %s.", nome));
		}
		return filtro;
	}

	public List<Aluno> buscaAlunoPorCpf(String cpf) {
		List<Aluno> filtro = this.alunos.values().stream().filter(a -> a.getCpf().equals(cpf)).collect(Collectors.toList());
		if (filtro.isEmpty()) {
			throw new RegistroNaoEncontradoException(String.format("Não foi possível encontrar um aluno com o CPF %s.", cpf));
		}
		return filtro;
	}

	public boolean autenticarUsuario(Funcionario funcionario, String usuario, String senha) {
		Autenticador autenticador = new AutenticadorImpl();
		return autenticador.autenticarUsuario(funcionario, usuario, senha);
	}
}
