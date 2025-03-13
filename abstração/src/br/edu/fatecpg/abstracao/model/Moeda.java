package br.edu.fatecpg.abstracao.model;

public class Moeda {
	
	public String objeto;
	public String troca;
	public double valor;
	
	public Moeda(String novoObjeto,String valorTroca, double realValor  ) {
		String objeto = novoObjeto;
		String troca = valorTroca;
		double valor = realValor;
	}
	
	public void transacoes () {
		System.out.println("Fazendo Trnsições...");
	}
	public void armazenar() {
		System.out.println("Ficando rico..");
	}
	public void servir() {
		System.out.println("Estou servindo...");
	}
}
