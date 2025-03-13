package br.edu.fatecpg.abstracao.model;

public class PiramidesEgito {
	 public String estrutura; 
	 public	String tumulo;
	 public	String simbolo;
	 
	 public PiramidesEgito(String nomeEstrutura,String nomeTumulo,String tipoSimbolo ) {
		 String estrutura = nomeEstrutura;
		 String tumulo = nomeTumulo;
		 String simbolo = tipoSimbolo;
	 }
	 
	 public void armazenar() {
		 System.out.println("Armazenando corpos..");
	 }
	 
	 public void servir() {
		 System.out.println("Estou Servindo..");
	 }
	 
	 public void habilidades() {
		 System.out.println("Demonstrando habilidaddes....");
	 }
}
