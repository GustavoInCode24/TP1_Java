package br.edu.fatecpg.abstracao.model;

public class Leao {
	public String nome;
	public String comida;
	public String sociavel;
	
	public Leao( String tipoNome,String tipoComida,String bandoSociavel) {
		String nome= tipoNome;
		String comida = tipoComida;
		String sociavel = bandoSociavel; 
	}
	
	public void rugir() {
		System.out.println("uaaaaaaa....");
	}
	public void cacar() {
		System.out.println("Estou indo Caçar...");
	}
	public void reproduzir() {
		System.out.println("Estou Reproduzindo....");
	}
	
}
