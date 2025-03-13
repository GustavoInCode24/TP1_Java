package br.edu.fatecpg.abstracao.model;

public class ConservacaoEnergia {

	public String fundamental;
	public String energia;
	public String tranformacao;
	
	public ConservacaoEnergia(String nomePrincipio, String tipoEnergia , String formaTransfomacao  ) {
		 
		String fundamental = nomePrincipio;
		String energia = tipoEnergia;
		String transformcao = formaTransfomacao;
		
	}
	
	public void otimizar() {
		System.out.println("otimizando Energia..");
		
	}
	public void calcular() {
		System.out.println("Calculando transformação..");
	}
	public void energia() {
		System.out.println("Economizando energia..");
	}
}
