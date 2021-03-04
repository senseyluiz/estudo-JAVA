import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Retangulo retangulo;
		retangulo = new Retangulo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Altura: ");
		retangulo.altura = sc.nextDouble(); 
		
		System.out.println("Largura: ");
		retangulo.largura = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n" , retangulo.area());
		System.out.printf("Perimetro: %.2f%n" , retangulo.perimetro());
		
		System.out.printf("Diagonal: %.2f%n", retangulo.diagonal());
		sc.close();

	}

}
