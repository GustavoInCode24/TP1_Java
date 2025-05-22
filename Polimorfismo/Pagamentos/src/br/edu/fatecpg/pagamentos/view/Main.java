package br.edu.fatecpg.polimorfo.view;
import br.edu.fatecpg.polimorfo.model.Boleto;
import br.edu.fatecpg.polimorfo.model.Credito;
public class Main {

	public static void main(String[] args) {
		
		Boleto boleto = new Boleto(500);
		String retorno = boleto.processar();
		System.out.println(retorno);
		
		Credito cr = new Credito(200);
		
		String r = cr.processar("Ale","3030",24);
		System.out.println(r);
		
		r = cr.processar();
		System.out.println(r);
		
		
	}

}
