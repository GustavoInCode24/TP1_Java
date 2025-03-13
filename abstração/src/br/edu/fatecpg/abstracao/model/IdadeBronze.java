package br.edu.fatecpg.abstracao.model;

public class IdadeBronze {
	
	public int periodo;
	public int desnevolvimento;
	public int transicao;
	
	public IdadeBronze(int periodoInicial,int anoDesenvolvimento,int anoTransicao) {
		int periodo = periodoInicial;
		int desenvolvimento = anoDesenvolvimento;
		int trasicao = anoTransicao;
		
	}
	
		public void  produzir() {
			System.out.println("Produzindo...");
		}  
		
		public void rotas(){
			System.out.println("Estabelecendo Rotas...");
		}
		
		public void desenvolver() {
			System.out.println("Desenvolvendo produto...");
		}
}
