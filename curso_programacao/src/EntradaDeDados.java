import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome, materia;		
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("NOME: ");
		nome = sc.nextLine();
		
		System.out.println("Materia: ");
		materia = sc.nextLine();
		
		System.out.println("1º Bimestre: ");
		nota1 = sc.nextDouble();
		
		System.out.println("2º Bimestre: ");
		nota2 = sc.nextDouble();
		
		System.out.println("3º Bimestre: ");
		nota3 = sc.nextDouble();
		
		System.out.println("4º Bimestre");
		nota4 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("Matéria : %s %n"
				+ "Nome: %s %n"
				+ "Média dos Bimestres: %.1f", materia, nome, media);		
		
		sc.close();

	}

}
