import java.util.Locale;
import java.util.Scanner;

public class ex1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double salarioFixo = sc.nextDouble();
		double totalVendas = sc.nextDouble();
		double comissao = totalVendas * 0.15;
		double total = salarioFixo + comissao;
		
		System.out.printf("TOTAL = R$ %.2f%n", total);
		
		sc.close();

	}

}
