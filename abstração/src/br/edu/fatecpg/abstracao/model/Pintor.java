package br.edu.fatecpg.abstracao.model;

public class Pintor {
	public String artista;
	public String tecnicas;
	public String ideias;
	
	public Pintor(String nomeArtistaa,String novaTecnica,String novaIdeias  ) {
		String artista = nomeArtistaa;
		String tecnicas = novaTecnica;
		String ideias = novaIdeias;
	}
	
	public void criar() {
		System.out.println("Estou Criando....");
	}
	public void explora() {
		System.out.println("Explorado...");
	}
	public void decorar() {
		System.out.println("Decorarano...");
	}
}
