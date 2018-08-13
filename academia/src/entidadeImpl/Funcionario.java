package entidadeImpl;

import java.util.Date;

import tipo.TipoCargo;

public class Funcionario extends Pessoa {
	private TipoCargo cargo;
	private String salario;
	private String usuario;
	private String senha; // armazenamento em memória

	public Funcionario(String nome, String cpf, TipoCargo cargo) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
	}

	public Funcionario() {
	}

	public Funcionario(String nome, String cpf, TipoCargo cargo, String usuario, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.usuario = usuario;
		this.senha = senha;
	}

	public Funcionario(String nome, String rg, String cpf, Date dtNascimento, String telefone, String endereco, TipoCargo cargo, String salario, String usuario,
			String senha) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cargo = cargo;
		this.salario = salario;
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Funcionario) {
			return this.cpf.equals(((Funcionario) obj).cpf);
		}
		return false;
	}

	public TipoCargo getCargo() {
		return this.cargo;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSalario() {
		return this.salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public void setCargo(TipoCargo cargo) {
		this.cargo = cargo;
	}
}
