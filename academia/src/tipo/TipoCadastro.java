package tipo;

public enum TipoCadastro {

	ALUNO("Aluno"),
	FUNCIONARIO("Funcionario");

	private String name;

	private TipoCadastro(String cargo) {
		this.name = cargo;
	}

	@Override
	public String toString() {
		return this.name;
	}

	public String getName() {
		return this.name;
	}

}
