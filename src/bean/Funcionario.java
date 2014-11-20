package bean;

abstract class Funcionario {
	private int codigoDepartamento;
	protected double salario;
	public String nomeFuncionario;
	private String dataAdmissao;
	private String rg;

	public Funcionario() {
	}

	protected Funcionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public int getCodigoDepartamento() {
		return this.codigoDepartamento;
	}

	public void setCodigoDepartamento(int codigo_departamento) {
		this.codigoDepartamento = codigo_departamento;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNomeFuncionario() {
		return this.nomeFuncionario;
	}

	public void setNomeFuncionario(String nome_funcionario) {
		this.nomeFuncionario = nome_funcionario;
	}

	public String getDataAdmissao() {
		return this.dataAdmissao;
	}

	public void setDataAdmissao(String data_admissao) {
		this.dataAdmissao = data_admissao;
	}

	public String getRG() {
		return this.rg;
	}

	public void setRG(String rg) {
		this.rg = rg;
	}

	public void recebeAumento(double quantidade) {
		double novoSalario;
		novoSalario = this.salario + quantidade;
		salario = novoSalario;
	}

	public double calculaGanhoAnual() {
		double valor;
		valor = this.salario * 12;
		return valor;
	}
	
	abstract double getBonificacao();
}
