import bean.Gerente;;

public class TestaFuncionario {

	public static void main(String args[]) {
		Gerente f1 = new Gerente();
		f1.setNomeFuncionario("Elise");
		f1.setSalario(100);
		f1.recebeAumento(50);

		System.out.println("Funcionario: " + f1.nomeFuncionario);
		System.out.println("Salario Atual: " + f1.getSalario());
		System.out.println("Salario Anual: " + f1.calculaGanhoAnual());

	}

}
