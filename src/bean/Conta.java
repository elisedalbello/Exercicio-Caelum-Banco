package bean;

public class Conta {
	protected int numero;
	protected String dono;
	protected double saldo;
	protected double limite;
	
	//GETTERS E SETTERS------------------------------------------------------------------------------
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public String getDono(){
		return this.dono;
	}
	
	public void setDono(String dono){
		this.dono = dono;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public double getLimite(){
		return this.limite;
	}
	
	public void setLimite(double limite){
		this.limite = limite;
	}
	
	//MÉTODOS---------------------------------------------------------------------------------------------------------
	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	public void saca(double valor) {
			this.saldo -= valor;
	}
	
//	public boolean transfere(Conta destino, double valor) {
//		boolean retirou = this.saca(valor);
//		if (retirou == false) {
//			// não deu pra sacar!
//			return false;
//		}else {
//			destino.deposita(valor);
//			return true;
//		}
//	}
	
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa;
	}
}
