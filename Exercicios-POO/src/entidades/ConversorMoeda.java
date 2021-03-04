package entidades;

public class ConversorMoeda {
	
	public static double IOF = 0.06;
	
	public static double dolarParaReal(double valorAtual, double valorComprar){
		return valorAtual * valorComprar * (1.0 + IOF);
	}
	
	

}
