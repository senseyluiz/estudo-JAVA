package Programa;

import java.util.Locale;
import java.util.Scanner;

import Utilitarios.Cliente;

public class aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cliente cliente;
		
		System.out.print("Entre com o número da conta: ");
		int numConta = sc.nextInt();
		
		System.out.print("Entre com o titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.print("Realizar deposito inicial: Y / N: ");
		char resposta = sc.next().charAt(0);
		
		
		if(resposta == 'Y') {
			System.out.print("Valor do depósito: ");
			double valInicial = sc.nextDouble();
			cliente = new Cliente(numConta, titular, valInicial);
		}
		else{
			cliente = new Cliente(numConta, titular);
		}		
		
		System.out.println();
		System.out.println("Dados da Conta:");
		System.out.printf("Conta: %d%n"
				+ "Titular: %s%n"
				+ "Saldo: R$ %.2f%n",cliente.getNumConta(),cliente.getTitular(), cliente.getSaldo());
		
		System.out.print("Entre com um valor de depósito: ");
		cliente.deposito(sc.nextDouble());
		
		System.out.println();
		System.out.println("Atualização da Conta:");
		System.out.printf("Conta: %d%n"
				+ "Titular: %s%n"
				+ "Saldo: R$ %.2f%n",cliente.getNumConta(),cliente.getTitular(), cliente.getSaldo());
		
		System.out.print("Entre com o valor do saque:");
		cliente.saque(sc.nextDouble());
		
		System.out.println();
		System.out.println("Atualização da Conta:");
		System.out.printf("Conta: %d%n"
				+ "Titular: %s%n"
				+ "Saldo: R$ %.2f%n",cliente.getNumConta(),cliente.getTitular(), cliente.getSaldo());
		
		sc.close();

	}

}
