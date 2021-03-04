package Utilitarios;

public class Cliente {

	private int numConta;
	private String titular;
	private double saldo;
	
	public Cliente(int numConta, String titular, double valInicial) {
		this.numConta = numConta;
		this.titular = titular;
		deposito(valInicial);		
	}
	
	
	public Cliente(int numConta, String titular) {
		this.numConta = numConta;
		this.titular = titular;				
	}
	
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getTitular() {
		return this.titular;
	}	
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	
	public void saque(double saque) {
		this.saldo -= saque + 5.00;
	}
	
}
