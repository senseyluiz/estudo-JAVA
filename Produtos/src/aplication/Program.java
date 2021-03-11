package aplication;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Entre com o número de produtos: ");
		int qtdeProdutos = sc.nextInt();
		
		for (int i = 1; i <= qtdeProdutos; i++) {
			System.out.println("Produto nº " + i);
			System.out.print("Comum, Usado ou Importado [c/u/i]: ");
			char resp = sc.next().toUpperCase().charAt(0);
			
			while (resp != 'C' && resp != 'U' && resp != 'I') {
				System.out.println("Opção inválida.");
				System.out.println();
				System.out.print("Comum, Usado ou Importado [c/u/i]: ");
				resp = sc.next().toUpperCase().charAt(0);
			}
			
			System.out.println();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();	
			
			
			if (resp == 'C') {
				Produto produto = new Produto(nome, preco);
				list.add(produto);
			}
			
			if (resp == 'U') {
				System.out.print("Data de Fabricação: DD/MM/YYYY: ");
				
				Date dataFabricacao = sdf.parse(sc.next());
				Produto produtoUsado = new ProdutoUsado(nome, preco, dataFabricacao);
				list.add(produtoUsado);
			}
			
			if (resp == 'I') {
				System.out.print("Taxa da alfandega: ");
				double taxaAlfandega = sc.nextDouble();
				Produto produtoImportado = new ProdutoImportado(nome, preco, taxaAlfandega);
				list.add(produtoImportado);
			}
			
		}
		
		for (Produto produto : list ) {
			System.out.println(produto.etiquetaPreco());
		}
		
		
		sc.close();

	}

}
