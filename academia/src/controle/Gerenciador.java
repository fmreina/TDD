package controle;

import static tipo.TipoCargo.ADM;
import static tipo.TipoCargo.TREINADOR;

import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import entidadeImpl.Aluno;
import entidadeImpl.CadastroDTO;
import entidadeImpl.Funcionario;
import excecao.UsuarioOuSenhaInvalidosException;
import tipo.TipoCadastro;
import tipo.TipoCargo;
import visao.AlunosPanel;
import visao.CadastroFromPanel;
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
		this.showPanel(new FuncionariosPanel(this, cargo));
	}

	public void goListaAlunos(TipoCargo cargo) {
		this.showPanel(new AlunosPanel(this, cargo));
	}

	public void goCadastroForm(TipoCargo cargo, TipoCadastro tipoCadastro) {
		this.showPanel(new CadastroFromPanel(this, cargo, tipoCadastro));
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
