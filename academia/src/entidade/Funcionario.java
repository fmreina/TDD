package entidade;

import tipo.TipoCargo;

public class Funcionario extends Pessoa {
	private TipoCargo cargo;
	private String usuario;
	private String senha;

	public Funcionario(String nome, String cpf, TipoCargo cargo) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
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
}
