import bean.AtualizadoDeContas;
import bean.Conta;
import bean.ContaCorrente;
import bean.ContaPoupanca;

public class TestaContas {

	public static void main(String[] args) {
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		AtualizadoDeContas adc = new AtualizadoDeContas(0.01);

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);

		System.out.println("Saldo de c: " + c.getSaldo());
		System.out.println("Saldo de cc: " + cc.getSaldo());
		System.out.println("Saldo de cp: " + cp.getSaldo());

		System.out.println("-----------------------------------------------------------------------------");

		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		System.out.println("Saldo Total: " + adc.getSaldoTotal());
	}
}
