import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class boletim {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", aluno.notaFinal());
		
		if (aluno.notaFinal() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS %n", aluno.pontosFaltantes());
		}else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
