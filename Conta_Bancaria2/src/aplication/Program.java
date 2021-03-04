package aplication;

import java.util.Locale;
import java.util.Scanner;

import utilitarios.Conta;
import utilitarios.ValidaCPF;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta  conta;
		
		System.out.print("Agencia Nº: ");
		int agencia = sc.nextInt();
		
		System.out.print("Conta Nº: ");
		int numConta = sc.nextInt();
		
		System.out.print("Titular: ");
		sc.nextLine();
		String titular = sc.nextLine();		
		
		System.out.print("CPF: ");		
		String cpf = sc.next();
		
		
		// VALIDANDO CPF
		
		ValidaCPF validaCpf;
		
		validaCpf = new ValidaCPF(cpf);
		while (!validaCpf.getValido()) {
			System.out.print("Digite o CPF: ");
			cpf = sc.next();
			validaCpf = new ValidaCPF(cpf);
		}
		
		
		System.out.print("Endereço: ");
		sc.nextLine();
		String endereco = sc.nextLine();
		
		
		System.out.print("Nº: ");
		int numCasa = sc.nextInt();
		
		System.out.print("Cidade: ");
		sc.nextLine();
		String cidade = sc.nextLine();
		
		System.out.print("CEP: ");
		int cep = sc.nextInt();
		
		System.out.print("Telefone: ");
		String telefone = sc.next();
		
		System.out.print("Deposito inicial: Y / N ");
		char resposta = sc.next().toUpperCase().charAt(0);
		
		while (resposta != 'Y' && resposta != 'N') {
			System.out.println("Opção incorreta, tente novamente: ");
			System.out.print("Deposito inicial: Y / N ");
			resposta = sc.next().toUpperCase().charAt(0);
		}
		
		if (resposta == 'Y') {
			System.out.print("Valor do depósito: ");
			double depositoInicial = sc.nextDouble();	
			conta = new Conta(agencia, numConta, titular, cpf, endereco, numCasa, cidade, cep, telefone, depositoInicial );
		}
		else {			
			conta = new Conta(agencia, numConta, titular, cpf, endereco, numCasa, cidade, cep, telefone);
		}
		
		System.out.println();
		
		System.out.println("Conta cadastrada com SUCESSO!!!");
		
		System.out.println();
		System.out.println(conta);
		
		// Operações a serem realizadas
		
		System.out.println("[1] Depósito");
		System.out.println("[2] Saque");
		System.out.println("[4] Saldo");
		System.out.println("[3] Fechar");
		System.out.print("Ecolha uma opção: ");
		int op = sc.nextInt();
		
		while (op != 1 && op != 2 && op != 3 && op !=4) {
			System.out.println("Opção incorreta. Escolha uma opção correta:");
			System.out.println("[1] Depósito");
			System.out.println("[2] Saque");
			System.out.println("[3] Saldo");
			System.out.println("[4] Fechar");
			System.out.print("Ecolha uma opção: ");
			op = sc.nextInt();
		}
		
		if (op == 1) {
			System.out.print("Valor do Depósito: ");
			double deposito = sc.nextDouble();
			conta.deposito(deposito);
			System.out.println("Depósito efetuado com Sucesso!!!");
			System.out.println();
			System.out.println(conta.extrato());
			
		}else if(op == 2) {
			System.out.print("Valor do Saque: ");
			double saque = sc.nextDouble();
			if (saque >= conta.getSaldo()) {
				conta.saque(saque);
				System.out.println("Saque efetuado com Sucesso!!!");
				System.out.println();
				System.out.println(conta.extrato());
				
			}else {
				System.out.println("Saldo insuficiente para saque.");
				System.out.println(conta.extrato());
			}
			
		}else if(op == 3) {
			System.out.println(conta.extrato());
			
		}else {
			System.out.println("Operação Encerrada.");
		}
		
		
		sc.close();

	}

}
