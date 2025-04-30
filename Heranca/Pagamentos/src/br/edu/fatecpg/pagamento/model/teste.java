package br.edu.fatecpg.pagamento.model;

public class teste implements Pagamentos{

	public double valor = 100;
	public double valorAcresimo;
	public double valordesconto;
	
	
	
	
	
	public void calcularPagamneto() {

		valorAcresimo = (valor * 1.05);
		
		valordesconto = (valor * 0.8);
		
	}

	@Override
	public void emitirRecibos() {
		
		System.out.println("Valor a Pagar: " + valorAcresimo);
		
		System.out.println("Valor com desconto de 20%: " + valordesconto);
		
	}

}
