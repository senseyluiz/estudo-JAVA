import java.util.Locale;
import java.util.Scanner;

public class ex1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horas = sc.nextInt();
		int velocidade = sc.nextInt();
		double distancia = horas * velocidade;
		double litros = distancia / 12;
		
		System.out.printf("%.3f%n", litros);		
		
		
		sc.close();

	}

}
