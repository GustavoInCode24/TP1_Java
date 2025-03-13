package br.edu.fatecpg.abstracao.model;

public class Galaxia {
	
	public String sistema;
	public String forma;
	public int luz;
	
	public Galaxia(String nomeSistema,String galaxiaForma, int anosLuz  ) {
		String sistema = nomeSistema;
		String forma = galaxiaForma;
		int luz = anosLuz; 
	}
	
	public void gerar() {
		System.out.println("Gerando Estrela..");
	
	}
	public void expandir () {
		System.out.println("Expandindo..");
	
	}
	public void servir () {
		System.out.println("Sou berço..");
	
	}
	
}
