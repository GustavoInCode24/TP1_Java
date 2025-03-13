package br.edu.fatecpg.abstracao.model;

public class ImperioRomano {
	
	 String nomeImperador;
	    int anoFundacao;
	    int extensaoTerritorial;

	    
	    public ImperioRomano(String nomeImperadorInicial, int anoFundacaoInicial, int extensaoTerritorialInicial) {
	        nomeImperador = nomeImperadorInicial;
	        anoFundacao = anoFundacaoInicial;
	        extensaoTerritorial = extensaoTerritorialInicial;
	    }

	    public void exibirInformacoes() {
	        System.out.println("Imperador: " + nomeImperador);
	        System.out.println("Ano de Fundação: " + anoFundacao);
	        System.out.println("Extensão Territorial: " + extensaoTerritorial + " km²");
	    }

	    public void conquistarTerritorio(int territorioAdicional) {
	        extensaoTerritorial += territorioAdicional;
	        System.out.println("Novo território conquistado! Extensão total: " + extensaoTerritorial + " km²");
	    }

	    public void mudarImperador(String novoImperador) {
	        nomeImperador = novoImperador;
	        System.out.println("Novo imperador: " + nomeImperador);
	    }
}
