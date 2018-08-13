package entidadeImpl;

public class Pessoa {
	protected String nome;
	protected String rg;
	protected String cpf;
	// protected Date dtNascimento;
	protected String dtNascimento;
	protected String telefone;
	protected String endereco;

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getRg() {
		return this.rg;
	}

	public String getDtNascimento() {
		return this.dtNascimento;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public String getEndereco() {
		return this.endereco;
	}

	@Override
	public String toString() {
		return String.format("%s, %s", this.nome, this.cpf);
	}
}
