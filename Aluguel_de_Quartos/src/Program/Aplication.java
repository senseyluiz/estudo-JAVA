package Program;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Cliente;

public class Aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("HOTEL FICTÍCIO");
		
		System.out.print("Quantos quartos serão alugados: ");
		int qtde = sc.nextInt();
				
		
		System.out.println();
		
		Cliente[] cliente = new Cliente[10]; 
		
		for (int i = 0; i < qtde; i++) {
			
			System.out.printf("Cliente nº %d: %n", (i + 1));
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			sc.nextLine();
			
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			
			
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			cliente[quarto] = new Cliente(nome, email, quarto);
			
			System.out.println();						
			
		}
		
		System.out.println("Quartos alugados: ");
		
		for(int a = 0; a < 10; a++ ) {
			if (cliente[a] != null) {
				System.out.println(cliente[a].toString());
			}
		}
		
		
		sc.close();
		

	}

}
