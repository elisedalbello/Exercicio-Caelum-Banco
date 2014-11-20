import bean.Conta;
import bean.ControleDeBonificacoes;
import bean.Gerente;

public class TestaMetodos {
	public static void main(String[] args) {
		// criando a conta
		Conta minhaConta;
		minhaConta = new Conta();

		// alterando os valores de minhaConta
		minhaConta.setDono("Duke");
		minhaConta.setSaldo(1000);

		// saca 200 reais
		minhaConta.saca(200);

		// deposita 500 reais
		minhaConta.deposita(500);
		System.out.println(minhaConta.getSaldo());
		
		ControleDeBonificacoes cbd = new ControleDeBonificacoes();
		Gerente f = new Gerente();
		cbd.registra(f);
		
	}
}
