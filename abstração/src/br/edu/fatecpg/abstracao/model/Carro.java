package br.edu.fatecpg.abstracao.model;

public class Carro {
	public String marca;
    public String modelo;
    public int ano;
    
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void ligar() {
        System.out.println("O carro " + marca + " " + modelo + " está ligado.");
    }

    public void acelerar() {
        System.out.println("O carro " + marca + " " + modelo + " está acelerando.");
    }

    public void frear() {
        System.out.println("O carro " + marca + " " + modelo + " está freando.");
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
