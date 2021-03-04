import java.util.Locale;
import java.util.Scanner;

public class ex1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario = sc.nextInt();
		double horasTrabalhadas = sc.nextDouble();
		double valorHora = sc.nextDouble();
		double salario = horasTrabalhadas * valorHora;
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
