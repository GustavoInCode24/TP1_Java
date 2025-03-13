package br.edu.fatecpg.abstracao.model;

public class Danca {
	
		String nome;
	    String estiloDanca;
	    int idade;

	    
	    public Danca(String nomeInicial, String estiloDancaInicial, int idadeInicial) {
	        nome = nomeInicial;
	        estiloDanca = estiloDancaInicial;
	        idade = idadeInicial;
	    }

	    public void dancar() {
	        System.out.println(nome + " está dançando " + estiloDanca + ".");
	    }

	    public void exibirInformacoes() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Estilo de dança: " + estiloDanca);
	        System.out.println("Idade: " + idade);
	    }

	    public void mudarEstiloDanca(String novoEstilo) {
	        estiloDanca = novoEstilo;
	        System.out.println(nome + " agora dança " + novoEstilo + ".");
	    }
}
