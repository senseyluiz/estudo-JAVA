package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HoraContrato;
import entities.Trabalhador;
import entitiesEnum.NivelTrabalhador;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		
		System.out.println("Entre com os dados do trabalhador:");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		
		System.out.print("Nível: ");
		String nivel = sc.nextLine();
		
		System.out.print("Salario Base: ");
		double salarioBase = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivel), salarioBase, new Departamento(nomeDepartamento));
		
		
		System.out.print("Quantos contratos para este Trabalhador? ");
		int n = sc.nextInt();
		
		for (int i=1; i <= n; i++) {
			
			System.out.println("Entre com os dados do contrato Nº " + i);
			System.out.print("DD/MM/YYYY: ");
			Date data = sdf.parse(sc.next());
			
			System.out.print("Valor por Hora: ");
			double valorPorHora = sc.nextDouble();
			
			System.out.print("Duração (Horas) do contrato: ");
			int horas = sc.nextInt();
			
			HoraContrato contrato = new HoraContrato(data,valorPorHora, horas);
			trabalhador.adicionarContrato(contrato);
		}
		
		System.out.println();
		
		System.out.println("Entre com o mês e ano para calcular o salário: ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Renda para " + mesAno + ":" + String.format("%.2f", trabalhador.renda(ano, mes)));
		sc.close();
	}

}
