import java.util.Locale;
import java.util.Scanner;

public class ex1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1 = sc.nextInt();
		int npeca1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int npeca2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double total = (npeca1 * valor1) + (npeca2 * valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		
		
		sc.close();
		
	}

}
