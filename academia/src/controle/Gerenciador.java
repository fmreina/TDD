package controle;

import static tipo.TipoCargo.ADM;
import static tipo.TipoCargo.TREINADOR;

import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JFrame;
import javax.swing.JPanel;

import entidadeImpl.Aluno;
import entidadeImpl.CadastroDTO;
import entidadeImpl.Funcionario;
import excecao.UsuarioOuSenhaInvalidosException;
import tipo.TipoCadastro;
import tipo.TipoCargo;
import visao.AlunosPanel;
import visao.CadastroFormPanel;
import visao.CadastroPanel;
import visao.FuncionariosPanel;
import visao.HomePanel;
import visao.LoginPanel;

public class Gerenciador {

	private Academia academia;
	private JFrame window;

	public Gerenciador(JFrame frame) {
		this.window = frame;

		this.academia = new Academia();
		this.academia.cadastraFuncionario(new Funcionario("Administrador", "12345678910", TipoCargo.ADM, "qwe", "qwe"));
		this.academia.cadastraFuncionario(new Funcionario("Funcionário", "01234567890", TipoCargo.TREINADOR, "zxc", "zxc"));
		this.academia.cadastraFuncionario(new Funcionario("Administrador 2", "1", TipoCargo.ADM, "1", "1"));
		this.academia.cadastraFuncionario(new Funcionario("Funcionário 2", "2", TipoCargo.TREINADOR, "2", "2"));
		this.academia.cadastraFuncionario(new Funcionario("Funcionário 3", "3", TipoCargo.TREINADOR, "3", "3"));
		this.academia.cadastraFuncionario(new Funcionario("Funcionário 4", "4", TipoCargo.TREINADOR, "4", "4"));
		this.academia.cadastraFuncionario(new Funcionario("Funcionário 5", "5", TipoCargo.TREINADOR, "5", "5"));
		this.academia.cadastraFuncionario(new Funcionario("Funcionário 6", "6", TipoCargo.TREINADOR, "6", "6"));
		this.academia.cadastraFuncionario(new Funcionario("Funcionário 7", "7", TipoCargo.TREINADOR, "7", "7"));
		
		this.academia.cadastraAluno(new Aluno("Aluno 1", "111", "111", new Date(), "1111", "1111"));
		this.academia.cadastraAluno(new Aluno("Aluno 2", "222", "222", new Date(), "1111", "1111"));
		this.academia.cadastraAluno(new Aluno("Aluno 3", "333", "333", new Date(), "1111", "1111"));
		this.academia.cadastraAluno(new Aluno("Aluno 4", "444", "444", new Date(), "1111", "1111"));
		this.academia.cadastraAluno(new Aluno("Aluno 5", "555", "555", new Date(), "1111", "1111"));
		this.academia.cadastraAluno(new Aluno("Aluno 6", "666", "666", new Date(), "1111", "1111"));
		this.academia.cadastraAluno(new Aluno("Aluno 7", "777", "777", new Date(), "1111", "1111"));
		this.academia.cadastraAluno(new Aluno("Aluno 8", "888", "888", new Date(), "1111", "1111"));
		this.academia.cadastraAluno(new Aluno("Aluno 9", "999", "999", new Date(), "1111", "1111"));
		
	}

	public void start() {

		LoginPanel loginPanel = new LoginPanel(this);

		this.window.getContentPane().removeAll();
		this.window.getContentPane().add(loginPanel);
		this.window.pack();
	}

	public void sair() {
		this.window.dispatchEvent(new WindowEvent(this.window, WindowEvent.WINDOW_CLOSING));
	}

	public Funcionario autenticate(String user, String password) throws UsuarioOuSenhaInvalidosException {
		return this.academia.autenticarUsuario(user, password);
	}

	public void showHome(Funcionario funcionario) {
		switch (funcionario.getCargo()) {
		case ADM:
			this.goHome(ADM);
			break;
		case TREINADOR:
		default:
			this.goHome(TREINADOR);
			break;
		}
	}

	public void showPanel(JPanel panel) {
		this.window.getContentPane().removeAll();
		this.window.getContentPane().add(panel);
		this.window.pack();
	}

	public void goHome(TipoCargo cargo) {
		this.showPanel(new HomePanel(this, cargo));
	}

	public void goCadastroHome(TipoCargo cargo) {
		this.showPanel(new CadastroPanel(this, cargo));
	}

	public void goListaFuncionarios(TipoCargo cargo) {
		List<Funcionario> funcs = this.academia.getFuncionarios().values().stream().collect(Collectors.toList());
		this.showPanel(new FuncionariosPanel(this, cargo, funcs));
		
		
	}

	public void goListaAlunos(TipoCargo cargo) {
		List<Aluno> alunos = this.academia.getAlunos().values().stream().collect(Collectors.toList());
		this.showPanel(new AlunosPanel(this, cargo, alunos));
	}

	public void goCadastroForm(TipoCargo cargo, TipoCadastro tipoCadastro) {
		this.showPanel(new CadastroFormPanel(this, cargo, tipoCadastro));
	}

	public void finalizarCadastro(CadastroDTO dto) {
		switch (dto.getTipoCadastro()) {
		case ALUNO:
			Aluno newAluno = new Aluno(dto.getNome(), dto.getRg(), dto.getCpf(), dto.getDtNascimento(), dto.getTelefone(), dto.getEndereco());
			this.academia.cadastraAluno(newAluno);
			break;
		case FUNCIONARIO:
			Funcionario newFuncionario = new Funcionario(dto.getNome(), dto.getRg(), dto.getCpf(), dto.getDtNascimento(), dto.getTelefone(), dto.getEndereco(), dto.getCargo(),
					dto.getSalario(), dto.getUsuario(), dto.getSenha());
			this.academia.cadastraFuncionario(newFuncionario);
			break;
		default:
			break;
		}
	}
}
