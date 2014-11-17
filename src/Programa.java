
public class Programa {
	public static void main(String args[]) {
		Conta minhaConta = new Conta();

		minhaConta.dono = "Elise";
		minhaConta.saldo = 1000;
		
		System.out.println("O saldo atual é: " + minhaConta.saldo);

	}
}
