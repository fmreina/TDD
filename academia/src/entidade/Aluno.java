package entidade;

import java.util.Date;

public class Aluno extends Pessoa {

	private String matricula;
	private Date dtInicio;

	public Aluno(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Aluno) {
			return this.cpf.equals(((Aluno) obj).cpf);
		}
		return false;
	}

}
