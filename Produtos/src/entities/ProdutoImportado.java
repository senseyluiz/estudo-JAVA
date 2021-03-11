package entities;

public class ProdutoImportado extends Produto{
	private Double taxaAlfandega;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public Double getTaxaAlfandega() {
		return this.taxaAlfandega; 
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public Double precoTotal() {
		return super.getPreco() + taxaAlfandega;
	}
	
	@Override
	public String etiquetaPreco() {
		return String.format("%s $ %.2f (Taxa da Alfandega: $ %.2f", super.getNome(), precoTotal(), taxaAlfandega );
	}
}
