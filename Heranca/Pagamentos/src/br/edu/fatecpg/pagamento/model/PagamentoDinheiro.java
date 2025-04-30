package br.edu.fatecpg.pagamento.model;

public class PagamentoDinheiro implements Pagamentos{

	public double valor;
	public double valorDesconto;
	
	
	public PagamentoDinheiro(double valor) {
		
		this.valor = valor; 
	}
	
	
	@Override
	public void calcularPagamneto() {
	
		valorDesconto = (valor * 0.8);
		
	}

	@Override
	public void emitirRecibos() {
		
		System.out.println("Valor com desconto de 20%: " + valorDesconto);
	}

}
