package br.edu.fatecpg.abstracao.model;

public class Escultura {
	
	public String arte;
	public String variedade;
	public String ideias;
	
	public Escultura(String tipoArte,String tecnicaVariedades,String exprecaoIdeias ) {
		String arte = tipoArte;
		String variedade = tecnicaVariedades;
		String ideias = exprecaoIdeias;
	}
	
	public void criar() {
		System.out.println("Estou Criando..");
	}
	 public void expressar() {
		 System.out.println("Esta Expressando...");
	 }
	 public void decorar() {
		 System.out.println("Decorando a casa..");
	 }
}
