
public class Conta {
	int numero;
	String dono;
	double saldo;
	double limite;
	
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		}else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			// não deu pra sacar!
			return false;
		}else {
			destino.deposita(valor);
			return true;
		}
	}
}
