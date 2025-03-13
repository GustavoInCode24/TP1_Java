package br.edu.fatecpg.abstracao.model;

public class ChefCozinha {
		
	public String profissional;
	public String tecincas;
	public String pratro ;
		
	public ChefCozinha(String nomeProfissional,String nomeTecnica,String nomePratos ) {
		String profissional = nomeProfissional;
		String tecnicas = nomeTecnica;
		String pratos = nomePratos;
	}
	
	public void gerenciar() {
		System.out.println("Gerenciando..");
	}
	
	public void preparar() {
		System.out.println("Estou coziinhando ...");
	}
	public void criar() {
		System.out.println("Criando novos pratos...");
	}
}

