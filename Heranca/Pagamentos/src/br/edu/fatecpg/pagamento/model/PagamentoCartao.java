package br.edu.fatecpg.pagamento.model;

public class PagamentoCartao implements Pagamentos {

	public double valor;
	public double valorAcresimo;
	
	
	public PagamentoCartao(double valor) {
		
		this.valor = valor; 
	}
	
	
	
	@Override
	public void calcularPagamneto() {
		
	 valorAcresimo = valor * 1.05;
	 
	
		
	}

	@Override
	public void emitirRecibos() {
		
			System.out.println("Valor a Pagar: " + valorAcresimo);
		
	}

}
