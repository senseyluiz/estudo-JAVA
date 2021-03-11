package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Entre com o n�mero de contribuintes: ");
		int resp = sc.nextInt();
		
		for (int i=1; i <= resp; i++) {
			System.out.println("Contribuinte n� " + i);
			
			System.out.print("Pessoa F�sica ou Jur�dica [F/J]: ");
			char pessoa = sc.next().toUpperCase().charAt(0);
			System.out.println();
			
			while (pessoa != 'F' && pessoa != 'J') {
				System.out.println("Op��o Inv�lida");
				System.out.print("Pessoa F�sica ou Jur�dica [F/J]: ");
				pessoa = sc.next().toUpperCase().charAt(0);
				
			}
			
			if (pessoa == 'F') {
				sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();				
				System.out.print("Renda Anual: ");				
				double rendaAnual = sc.nextDouble();
				System.out.print("Despesas M�dicas: ");
				double despesasMedicas = sc.nextDouble();
				PessoaFisica fisica = new PessoaFisica(nome, rendaAnual, despesasMedicas);
				list.add(fisica);
				System.out.println();
			}
			
			if (pessoa == 'J') {
				sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();				
				System.out.print("Renda Anual: ");				
				double rendaAnual = sc.nextDouble();
				System.out.print("N�mero de funcion�rios: ");
				int numeroFuncionarios = sc.nextInt();
				PessoaJuridica juridica = new PessoaJuridica(nome, rendaAnual, numeroFuncionarios);
				list.add(juridica);
				System.out.println();
			}			
			
		}		
		
		double total = 0;
		for (Contribuinte contribuinte: list) {
			System.out.println("Impostos Pagos: ");
			System.out.printf("%s: $ %.2f%n", contribuinte.getNome(), contribuinte.valorImposto());
			total += contribuinte.valorImposto();
		}
		
		System.out.printf("TOTAL DE IMPOSTOS: $ %.2f%n", total);
		
		
		sc.close();	
		}

}
