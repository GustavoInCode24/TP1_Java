package br.edu.fatecpg.abstracao.model;

public class CameraDigital {
	
	 // Atributos da classe
    private String marca;
    private int resolucao;
    private int armazenamento;

    // Método construtor
    public CameraDigital(String marca, int resolucao, int armazenamento) {
        this.marca = marca;
        this.resolucao = resolucao;
        this.armazenamento = armazenamento;
    }
    
    public void tirarFoto() {
        System.out.println("Foto tirada com sucesso!");
    }

    public void gravarVideo() {
        System.out.println("Vídeo gravado com sucesso!");
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Resolução: " + resolucao + " MP");
        System.out.println("Armazenamento: " + armazenamento + " GB");
    }
	
	
	
}
