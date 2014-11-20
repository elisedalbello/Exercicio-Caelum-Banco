package bean;

public class ControleDeBonificacoes {

	private double totalBonificacoes = 0;
	
	public double getTotalBonificacoes(){
		return this.totalBonificacoes;
	}
	
	public void registra(Funcionario f){
		System.out.println("Adicionando bonificação do funcionário: " + f);
		this.totalBonificacoes += f.getBonificacao();
	}
}
