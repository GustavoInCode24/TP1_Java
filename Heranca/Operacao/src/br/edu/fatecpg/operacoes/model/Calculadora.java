package br.edu.fatecpg.operacoes.model;

public class Calculadora implements OperacaoMatematica {

	public double n1;
	public double n2;
	
	public Calculadora(double n1,double n2) {
		 this.n1 = n1;
		 this.n2 = n2;
	}
	
	
	public void somar() {
	
		System.out.println(n1 + n2);
		
	}


	public void subtrair() {
		
		System.out.println(n1 - n2);
		
	}

	
	public void multiplicar() {
		
		System.out.println(n1 * n2);
	}

	
	public void dividir() {
	
		System.out.println(n1 / n2);
		
	}

	
	
}
