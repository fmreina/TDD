package tipo;

import java.util.Arrays;

public enum TipoCargo {

	ADM(1L, "Administrador"),
	TREINADOR(2L, "Treinador");

	private Long id;
	private String name;

	private TipoCargo(Long id, String cargo) {
		this.id = id;
		this.name = cargo;
	}

	@Override
	public String toString() {
		return this.name;
	}

	public String getName() {
		return this.name;
	}

	public static TipoCargo getByName(String nome) {
		return Arrays.asList(values()).stream().filter(e -> e.getName().equals(nome)).findAny().orElse(null);
	}
}
