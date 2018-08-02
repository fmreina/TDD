package entidade;

public class Pessoa {
	protected String nome;
	protected String cpf;

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	@Override
	public String toString() {
		return String.format("%s, %s", this.nome, this.cpf);
	}
}
