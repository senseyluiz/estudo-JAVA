import java.util.Locale;
import java.util.Scanner;

public class ex1013 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int maiorAB = (A + B + Math.abs(A-B)) / 2;
		
		if (maiorAB > C) {
			System.out.println(maiorAB + " eh o maior");
		}else {
			System.out.println(C + " eh o maior");
		}
		
		
		sc.close();

	}

}
