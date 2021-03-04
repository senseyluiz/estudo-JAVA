package utilitarios;

public class Conta {
	private int agencia;
	private int numConta;
	private String titular;
	private String cpf;
	private String endereco;
	private int numCasa;
	private String cidade;
	private int cep;
	private String telefone;
	private double saldo;
	
	
	//construtores
	
	public Conta(int agencia, int numConta, String titular, String cpf, String endereco, int numCasa, String cidade, int cep, String telefone, double depositoInicial) {
		this.agencia = agencia;
		this.numConta = numConta;
		this.titular = titular;
		this.cpf = cpf;
		this.endereco = endereco;
		this.numCasa = numCasa;
		this.cidade = cidade;
		this.cep = cep;
		this.telefone = telefone;
		deposito(depositoInicial);
	}	
	
	public Conta(int agencia, int numConta, String titular, String cpf, String endereco, int numCasa, String cidade, int cep, String telefone) {
		this.agencia = agencia;
		this.numConta = numConta;
		this.titular = titular;
		this.cpf = cpf;
		this.endereco = endereco;
		this.numCasa = numCasa;
		this.cidade = cidade;
		this.cep = cep;
		this.telefone = telefone;
		
	}	
	
	
	
	// getters e setters 
	
	public int getAgencia() {
		return this.agencia;
	}	
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular( String titular) {
		this.titular = titular;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getNumcasa() {
		return this.numCasa;
	}
	
	public void setNumCasa(int numCasa) {
		this.numCasa = numCasa;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public int getCep() {
		return this.cep;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	//açoes
	
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	
	public void saque(double saque) {
		this.saldo = saque;
	}
	
	public String toString() {
		return String.format("Conta nº: %d%n"
				+ "Agencia nº: %d%n"
				+ "Titular: %s%n"
				+ "CPF: %s%n"
				+ "Endereço: %s"
				+ " Nº %d%n"
				+ "Cidade: %s%n"
				+ "CEP: %d%n"
				+ "Telefone: %s%n"
				+ "Saldo Atual: %.2f%n", numConta, agencia, titular, cpf, endereco, numCasa, cidade, cep, telefone, saldo );
	}
	
	public String extrato() {
		return String.format("Conta: %d%n"
				+ "Agencia: %d%n"
				+ "Titular: %s%n"
				+ "Saldo: %.2f", numConta, agencia, titular, saldo);
	}
	
	
	
}
