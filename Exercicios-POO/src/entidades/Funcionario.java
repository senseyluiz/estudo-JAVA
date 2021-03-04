package entidades;

public class Funcionario {
	public String nome;
	public double salario;
	public double imposto;
	public double novoSalario;

	public double salarioLiquido() {
		novoSalario = salario - imposto;
		return novoSalario;
	}
	
	public void salarioAumentado(double porcentagem) {
		novoSalario += salario * porcentagem/100.0 ;
	}
}
