package entities;

public class PessoaFisica extends Contribuinte{
	
	private Double gastoSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double valorImposto() {
		double imposto = 0;
		if (super.getRendaAnual() < 20000) {
			
			if (gastoSaude > 0) {				
			imposto = (getRendaAnual() * 0.15) - (gastoSaude * 0.5);
			}
			else {
				imposto =  (getRendaAnual() * 0.15);
			}			
		}
		
		if (super.getRendaAnual() >= 20000) {
			if (gastoSaude > 0) {
				imposto = (getRendaAnual() * 0.25) - (gastoSaude * 0.5);
				
			}else {
				imposto = (getRendaAnual() * 0.25);
			}
		}
		
		if (imposto <= 0) {
			imposto = 0;
		}
		return imposto;
		
	}

}
