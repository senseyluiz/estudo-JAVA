package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Entre com o número de funcionários: ");
		int quantidadeFuncionarios = sc.nextInt();
		
		for (int i = 1; i <= quantidadeFuncionarios; i++) {
			
			System.out.println("Funcionário nº " + i);
			System.out.print("É terceirizado [s/n]? ");
			char resp = sc.next().toUpperCase().charAt(0);
			sc.nextLine();
			
			while (resp != 'S' && resp != 'N') {
				System.out.println("Opção inválida.");
				System.out.println();
				
				System.out.print("É terceirizado [s/n]? ");
				resp = sc.next().toUpperCase().charAt(0);
				sc.nextLine();
			}
			
			if (resp == 'N') {
				
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Horas: ");
				int horas = sc.nextInt();
				System.out.print("Valor da Hora: ");
				double valorHora = sc.nextDouble();
				Funcionario funcionario = new Funcionario(nome, horas, valorHora);
				list.add(funcionario);
			}
			
			if (resp == 'S') {
				
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Horas: ");
				int horas = sc.nextInt();
				System.out.print("Valor da Hora: ");
				double valorHora = sc.nextDouble();
				System.out.print("Valor adicional: ");
				double valorAdicional = sc.nextDouble();
				Funcionario funcionarioTerceiro = new FuncionarioTerceirizado(nome, horas, valorHora, valorAdicional);
				list.add(funcionarioTerceiro);
			}
		}
		
		System.out.println();
		System.out.println("Pagamentos: ");
		for (Funcionario funcionario : list) {
			System.out.println(funcionario.getNome() + " - $ " + String.format( "%.2f", funcionario.pagamento()));
			
		}
		
		sc.close();

	}

}
