package entities;

public class Produto {
	
	public String nome;
	public double preco;
	public int estoque;
	
	public double totalEstoque() {
		double total = preco * estoque;
		return total;
	}	
	
	public void adicionar(int quantidade) {
		this.estoque += quantidade;
	}
	
	public void remover(int quantidade) {
		this.estoque -= quantidade;
	}

}
