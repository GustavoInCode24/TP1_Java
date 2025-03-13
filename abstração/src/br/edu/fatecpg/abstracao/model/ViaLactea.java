package br.edu.fatecpg.abstracao.model;

public class ViaLactea {
	
	  	private String tipo;
	    private long numeroDeEstrelas;
	    private double diametroAnosLuz;

	    // Método construtor
	    public ViaLactea(String tipoInicial, long numeroEstrelasInicial, double diametroInicial) {
	        tipo = tipoInicial;
	        numeroDeEstrelas = numeroEstrelasInicial;
	        diametroAnosLuz = diametroInicial;
	    }

	    // Métodos

	    public String tipoVia() {
	        return tipo;
	    }

	    public long numeroEstrelas() {
	        return numeroDeEstrelas;
	    }

	    public double diametroAnosLuz() {
	        return diametroAnosLuz;
	    }
	
}
