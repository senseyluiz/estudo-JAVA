import java.util.Locale;
import java.util.Scanner;

public class ex1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X =sc.nextInt();
		double Y = sc.nextDouble();
		
		double total = X / Y;
		
		System.out.printf("%.3f Km/l%n", total);
		
		
		
		sc.close();

	}

}
