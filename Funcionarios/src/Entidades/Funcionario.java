package Entidades;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	// Método construtor
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	// Adicionando e  mostrando valores das variaveis
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getSalario() {
		return this.salario;
	}	
	
	
	//Calculo do salario aumentado
	
	public void aumentoSalario(double aumento) {
		this.salario += this.salario *  (aumento / 100);		
	}
	
	// Formatando texto para mostrar na tela
	
	public String toString() {
		return String.format("%d - %s: %.2f", id, nome, salario);
	}
	
	
	
	
	
	
	
	
	
	

}
