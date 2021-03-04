package aplication;

import java.util.Locale;
import java.util.Scanner;

import utilitarios.ValidaCPF;

public class teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o CPF: ");
		String cpf = sc.next();
		
		ValidaCPF validaCpf;
		
		validaCpf = new ValidaCPF(cpf);
		while (!validaCpf.getValido()) {
			System.out.print("Digite o CPF: ");
			cpf = sc.next();
			validaCpf = new ValidaCPF(cpf);
		}
				
		
		sc.close();
	}

}
