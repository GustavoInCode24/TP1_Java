package br.edu.fatecpg.produto.model;

public class Produto {

	public String nome;
	public double preco;
	public int estoque;
	
	public Produto(String nome) {
		this.nome = nome; 
	}
	
	public Produto(String nome,double preco) {
		
		this.nome = nome;
		this.preco = preco;
		
	}
	
	public Produto(String nome,double preco,int estoque) {
		
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}
}
