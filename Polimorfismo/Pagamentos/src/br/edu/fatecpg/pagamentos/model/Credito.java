package br.edu.fatecpg.polimorfo.model;

public class Credito extends IPagamento {
	
	String nome;
	String nCartao;
	int vezes;
	
	
	public Credito(double valor) {
		super(valor);
		
	}

	public Credito(double valor,String nome,String nCartao,int vezes) {
		super(valor);
		
		
		this.nome = nome;
		this.nCartao = nCartao;
		this.vezes = vezes;
	}
	
	public String processar(String nome, String nCartao,int vezes) {
		
		return "Pagamento Realizado!";
	}

}
