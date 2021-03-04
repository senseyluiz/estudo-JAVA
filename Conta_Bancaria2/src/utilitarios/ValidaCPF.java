package utilitarios;

public class ValidaCPF {
	private String cpf;
	private boolean teste, d1, d2;
	private int dig10;
	private int dig11;
	private int soma;
	private int res;
	private int dec = 10;
	private boolean valido;
	
		
	public ValidaCPF(String cpf) {
		
		// VERIFICANDO SE A QUANTIDADE DE NÚMEROS ESTÃO CORRETOS E SE OS DIGITOS SÃO REPETIDOS
		
		if(cpf.length() != 11 ||
				cpf.equals("00000000000") ||
				cpf.equals("11111111111") ||
				cpf.equals("22222222222") ||
				cpf.equals("33333333333") ||
				cpf.equals("44444444444") ||
				cpf.equals("55555555555") ||
				cpf.equals("66666666666") ||
				cpf.equals("77777777777") ||
				cpf.equals("88888888888") ||
				cpf.equals("99999999999")) {
			teste = false;
						
		}else {	
			// Adicionando os dois dígitos verificadores do CPF (Dois últimos dígitos)
			// 48 é a posição de "0" na tabela ASCII
			
			dig10 = cpf.charAt(9) - 48;
			dig11 = cpf.charAt(10) - 48;
			teste = true;
			
			// VERIFICANDO SE O PRIMEIRO DÍGITO VERIFICADOR ESTÁ CORRETO
			
			for (int i = 0; i < 9; i++) {
				
				soma += (cpf.charAt(i) - 48) * dec;
				dec -= 1;
				
			}
			
			res = soma * 10 % 11;
			if (res == 10 || res == 11){
				res = 0;
			}
			
			if (res == dig10) {
				d1 = true;
			}
			
			// VERIFICANDO SE O SEGUNDO DÍGITO VERIFICADOR ESTÁ CORRETO
			
			soma = 0;
			res = 0;
			dec = 11;
			
			for (int i = 0; i < 10; i++) {
				soma += (cpf.charAt(i) - 48) * dec;
				dec -= 1;
			}
			
			if (res == 10 || res == 11) {
				res = 0;
			}
			
			if (res == dig11) {
				d2 = true;
			}			
		}	
		
		// TESTANDO SE O CPF ESTÁ CORRETO
		
		if (teste && d1 && d2) {
			valido = true;			
		}else {
			valido = false;
			System.out.println("CPF Inválido.");
			System.out.println("Tente novamente.");
			System.out.println();
		}
			
	}
	
	
	public String getCpf() {
		return this.cpf;
	}
	
	public boolean getValido() {
		return this.valido;
	}	
	
}
