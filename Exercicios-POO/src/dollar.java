import java.util.Locale;
import java.util.Scanner;

import entidades.ConversorMoeda;

public class dollar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o pre�o do Dollar hoje: ");
		double dolarHoje = sc.nextDouble();
		
		System.out.print("Quantos dolar voc� vai comprar: ");
		double comprar = sc.nextDouble();
		
		System.out.printf("Voc� ir� pagar: R$ %.2f ", ConversorMoeda.dolarParaReal(dolarHoje, comprar));
		
		sc.close();
		
		
		

	}

}
