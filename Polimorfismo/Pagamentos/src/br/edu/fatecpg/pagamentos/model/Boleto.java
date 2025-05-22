package br.edu.fatecpg.polimorfo.model;
import java.util.Random;
public class Boleto  extends IPagamento{

	public Boleto(double valor) {
		super(valor);
	}

	private Random rd = new Random();
	
	@Override
	public String processar() {
		
		Long boleto = rd.nextLong(10000000000000000l,99999999999999999l);

		return "Pagamneto Em Boleto: " + boleto + " No Valor de: " + this.getValor();
	}

}
