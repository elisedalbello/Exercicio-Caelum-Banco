import bean.Conta;

public class Programa {
	public static void main(String args[]) {
		Conta minhaConta = new Conta();

		minhaConta.setDono("Elise");
		minhaConta.setSaldo(1000);
		
		System.out.println("O saldo atual é: " + minhaConta.getSaldo());

	}
}
