package entidadeImpl;

import tipo.TipoCadastro;
import tipo.TipoCargo;

public class CadastroDTO {

	private String usuario;

	private String senha;

	private TipoCadastro tipoCadastro;

	private String nome;

	private String rg;

	private String cpf;

	// private Date dtNascimento;
	private String dtNascimento;

	private String telefone;

	private String endereco;

	private TipoCargo cargo;

	private String salario;

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoCadastro getTipoCadastro() {
		return this.tipoCadastro;
	}

	public void setTipoCadastro(TipoCadastro tipoCadastro) {
		this.tipoCadastro = tipoCadastro;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	// public Date getDtNascimento() {
	// return this.dtNascimento;
	// }
	//
	// public void setDtNascimento(Date dtNascimento) {
	// this.dtNascimento = dtNascimento;
	// }
	public String getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public TipoCargo getCargo() {
		return this.cargo;
	}

	public void setCargo(TipoCargo cargo) {
		this.cargo = cargo;
	}

	public String getSalario() {
		return this.salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

}
