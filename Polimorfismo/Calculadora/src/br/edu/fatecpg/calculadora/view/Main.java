package br.edu.fatecpg.calculadora.view;
import br.edu.fatecpg.calculadora.model.Calculadora;
public class Main {

	public static void main(String[] args) {
		
		Calculadora cal = new Calculadora();
		
		System.out.println(cal.soma(10, 10));
		System.out.println(cal.soma(1.5, 5.0));		 
		System.out.println(cal.soma(10, 10, 10));

	}

}
