package br.edu.fatecpg.polimorfo.model;

public abstract class IPagamento {
	
	private double valor;
	
	public IPagamento(double valor) {
		
		this.valor = valor;
		
	}
	
	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	public  String processar() {
		return null;
	}
}
