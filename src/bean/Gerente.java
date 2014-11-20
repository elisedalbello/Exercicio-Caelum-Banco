package bean;

public class Gerente extends Funcionario {
	private int senha;

	// private int nrFuncionariosGerenciados;

	public int getSenha() {
		return this.senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido.");
			return true;
		} else {
			System.out.println("Acesso Negado.");
			return false;
		}
	}

	@Override
	double getBonificacao() {
		return this.salario * 1.4 + 1000;
	}
}
