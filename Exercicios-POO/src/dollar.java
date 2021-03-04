import java.util.Locale;
import java.util.Scanner;

import entidades.ConversorMoeda;

public class dollar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o preço do Dollar hoje: ");
		double dolarHoje = sc.nextDouble();
		
		System.out.print("Quantos dolar você vai comprar: ");
		double comprar = sc.nextDouble();
		
		System.out.printf("Você irá pagar: R$ %.2f ", ConversorMoeda.dolarParaReal(dolarHoje, comprar));
		
		sc.close();
		
		
		

	}

}
