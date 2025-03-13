package br.edu.fatecpg.abstracao.model;

public class Monitor {
	
	public String modelo;
	public String marca;
	public int preco;
	
	public Monitor (String tipomodelo,String nomeMaarca, int  valorpreco ) {
		String modelo = tipomodelo;
		String marca = nomeMaarca;
		int preco = valorpreco;
	}
	
	public void ligar() {
		System.out.println("Ligando..");
	}
	public void conectar() {
		System.out.println("Conectando a internet....");
	}
	public void desligar() {
		System.out.println("Desligado..");
	}
	
}
