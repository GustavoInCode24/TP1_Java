package br.edu.fatecpg.abstracao.model;

public class Smartfone {
	
	   	String marca;
	    String modelo;
	    int armazenamento;
	
	    public Smartfone(String marcaInicial,String modeloInicial,int armazenamentoIniciaal) {
	        marca = marcaInicial;
	        modelo = modeloInicial;
	        armazenamento = armazenamentoIniciaal;
	    }

	    // Métodos
	    public void fazerLigacao(String numero) {
	        System.out.println("Ligando para " + numero + "...");
	    }

	    public void tirarFoto() {
	        System.out.println("Capturando foto...");
	    }

	    public void instalarAplicativo(String nomeApp) {
	        System.out.println("Instalando " + nomeApp + "...");
	    }

}

