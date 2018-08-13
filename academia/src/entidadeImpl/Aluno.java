package entidadeImpl;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class Aluno extends Pessoa {

	private String matricula;
	private Date dtInicio;

	private AtomicLong idCounter = new AtomicLong(System.currentTimeMillis());

	public Aluno(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.dtInicio = new Date();
		this.matricula = this.gerarMatricula();
	}

	public Aluno(String nome, String rg, String cpf, Date dtNascimento, String telefone, String endereco) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
		this.dtInicio = new Date();
		this.matricula = this.gerarMatricula();
	}

	public String gerarMatricula() {
		return String.valueOf(this.idCounter.getAndIncrement());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Aluno) {
			return this.cpf.equals(((Aluno) obj).cpf);
		}
		return false;
	}

	public Date getDtInicio() {
		return this.dtInicio;
	}

	public String getMatricula() {
		return this.matricula;
	}
}
