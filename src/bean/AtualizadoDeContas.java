package bean;

public class AtualizadoDeContas {
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadoDeContas(double selic){
		this.selic = selic;
	}
	
	public double getSaldoTotal(){
		return this.saldoTotal;
	}
	
	public void roda(Conta c){
		c.atualiza(selic);
		this.saldoTotal += c.getSaldo();
	}
}
