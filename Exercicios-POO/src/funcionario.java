import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario;
		funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Salario Bruto: ");
		funcionario.salario = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.printf("Funcionario: %s, $ %.2f%n", funcionario.nome, funcionario.salarioLiquido());
		
		System.out.print("Percentual de aumento: ");
		funcionario.salarioAumentado(sc.nextDouble());
		
		System.out.printf("Atualizando Funcionario: %s, $ %.2f%n", funcionario.nome, funcionario.novoSalario);
		sc.close();
	}

}
