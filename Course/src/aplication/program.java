package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
				
		System.out.println("Entre com os dados do produto:");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade em stoque: ");
		produto.estoque = sc.nextInt();
		
		System.out.printf("Dados do Produto: %s, $ %.2f, %d unidades, Total: $%.2f%n", produto.nome, produto.preco, produto.estoque, produto.totalEstoque());
		
		System.out.print("Entre com a quantidade de produtos para adicionar: ");
		produto.adicionar(sc.nextInt());
		
		System.out.printf("Produto atualizado: %s, $ %.2f, %d unidades, Total: $%.2f%n", produto.nome, produto.preco, produto.estoque, produto.totalEstoque());
		
		System.out.print("Entre com a quantidade de produtos para remover: ");
		produto.remover(sc.nextInt());
		
		System.out.printf("Produto atualizado: %s, $ %.2f, %d unidades, Total: $%.2f%n", produto.nome, produto.preco, produto.estoque, produto.totalEstoque());
		
		sc.close();

	}

}
