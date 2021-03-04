
public class Alunos {

	public static void main(String[] args) {
		
		String aluno1, aluno2, aluno3, aluno4;
		char sexo1, sexo2, sexo3, sexo4;
		double media1, media2, media3, media4;
		
		aluno1 = "Luis Henrique Sales da Rocha";
		sexo1 = 'M';
		media1 = 60.8;
		
		aluno2 = "Anderson José da Costa";
		sexo2 = 'M';
		media2 = 73.9;
		
		aluno3 = "Rogério Ferreira Gonçalves";
		sexo3 = 'M';
		media3 = 59;
		
		aluno4 = "Andréia Miranda Souza";
		sexo4 = 'F';
		media4 = 89.5;
		
		System.out.println("Nome: " + aluno1);
		System.out.println("Sexo: " + sexo1);
		System.out.println("Média: " + media1);
		System.out.println("");
		
		System.out.println("Nome: " + aluno2);
		System.out.println("Sexo: " + sexo2);
		System.out.println("Média: " + media2);
		System.out.println("");
		
		System.out.println("Nome: " + aluno3);
		System.out.println("Sexo: " + sexo3);
		System.out.println("Média: " + media3);
		System.out.println("");
		
		System.out.println("Nome: " + aluno4);
		System.out.println("Sexo: " + sexo4);
		System.out.println("Média: " + media4);
		System.out.println("");		
		
		System.out.printf("A aluna %s teve a maior média entre os 4 alunos, ficando com %.2f pontos.", aluno4, media4);
	}

}
