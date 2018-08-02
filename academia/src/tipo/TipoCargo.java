package tipo;

public enum TipoCargo {

	ADM(1L, "Administrador"),
	TREINADOR(2L, "Treinador");

	private Long id;
	private String cargo;

	private TipoCargo(Long id, String cargo) {
		this.id = id;
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return this.cargo;
	}

}
