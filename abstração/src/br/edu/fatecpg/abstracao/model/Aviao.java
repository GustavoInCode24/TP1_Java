package br.edu.fatecpg.abstracao.model;

public class Aviao {
	
	 	String modelo;
	    int capacidadePassageiros;
	    double velocidadeMaxima;

	    
	    public Aviao(String modeloInicial, int capacidadeInicial, double velocidadeInicial) {
	        modelo = modeloInicial;
	        capacidadePassageiros = capacidadeInicial;
	        velocidadeMaxima = velocidadeInicial;
	    }

	    public void exibirInformacoes() {
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Capacidade de Passageiros: " + capacidadePassageiros);
	        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
	    }

	    public void acelerar(double incremento) {
	        velocidadeMaxima += incremento;
	        System.out.println("Velocidade aumentada para: " + velocidadeMaxima + " km/h");
	    }

	    public void alterarModelo(String novoModelo) {
	        modelo = novoModelo;
	        System.out.println("Modelo alterado para: " + modelo);
	    }
}
