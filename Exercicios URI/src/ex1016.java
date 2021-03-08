import java.util.Scanner;

public class ex1016 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int x = (num*60) / 30;
		
		System.out.println(x + " minutos");
		
		sc.close();
		
	}
}
