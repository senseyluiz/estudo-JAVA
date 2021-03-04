import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<String> list = new ArrayList<>();
		
		list.add("MAria");
		list.add("Alex");
		list.add("Renam");
		list.add("Rosangela");		
	
		System.out.println(list.size());
		
		
		for (String item : list) {
			System.out.println(item);
		}
		
		
		System.out.println("--------------------------------------------------");
		
		list.add(2, "Marcos");
		list.remove(1);
		
		for (String item : list) {
			System.out.println(item);
		}
		
		System.out.println("--------------------------------------------------");
		
		
		
		for (String item : list) {
			System.out.println(item);
		}
		
		sc.close();
		
		
		
	}

}
