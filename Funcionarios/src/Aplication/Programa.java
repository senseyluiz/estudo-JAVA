package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		Funcionario funcionario = null;
		
		// Pegar dados dos funcion�rios.
		
		System.out.print("Quantos funcion�rios ser�o registrados: ");
		int qtde = sc.nextInt();
		
		for (int i = 1; i <= qtde; i++) {
			
			System.out.println("Funcion�rio N� " + i + ": ");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome= sc.nextLine();
			
			System.out.print("Sal�rio: ");
			Double salario = sc.nextDouble();
			
			funcionario = new Funcionario(id, nome, salario);
			lista.add(funcionario);	
			
			System.out.println();
			
		}
		
		
		// Pegar dados para aumento de sal�rio
		
		System.out.print("Qual a identifica��o do funcion�rio que receber� aumento: ");
		Integer ident = sc.nextInt();
		sc.nextLine();		
		
		
		for ( Funcionario x : lista) {
			if (x.getId() == ident) {				
				System.out.print("Entre com a porcentagem a ser aumentada: ");
				double porcentagem = sc.nextDouble();
				x.aumentoSalario(porcentagem);
			}
		}
		
		// Mostrar dados dos funcion�rios atualizados
		
		System.out.println();
		System.out.println("Lista de funcion�rios");
		
		for (Funcionario x : lista) {
			System.out.println(x);
		}
		
		sc.close();

	}

}
