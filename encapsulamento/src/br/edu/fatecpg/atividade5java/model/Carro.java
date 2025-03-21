package br.edu.fatecpg.atividade5java.model;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade = 0;
    private boolean ligado;
    private double capacidadeTanque;

    public Carro(String marca, String modelo, int ano, double capacidadeTanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void ligar() {
        System.out.println("\nCarro Ligando...");
        System.out.println("\nCarro Ligado!");
        this.ligado = true;
    }

    public void acelerar() {
        if (ligado) {
            System.out.println("\nCarro Acelerando...");
            if (this.velocidade < 160) {
                this.velocidade += 20;
                System.out.println("Velocidade Atual: " + this.velocidade + "Km");
            }
            if (this.velocidade == 160) {
                System.out.println("Velocidade Máxima Atingida!");
            }
        } else {
            System.out.println("\nNão é possível acelerar um carro desligado!");
        }
    }

    public void frear() {
        if (ligado) {
            if (velocidade == 0) {
                System.out.println("\nO carro já está parado!");
            } else {
                System.out.println("\nCarro Freando...");
                this.velocidade -= 30;

                if (this.velocidade < 0) {
                    this.velocidade = 0;
                }
                if (this.velocidade == 0) {
                    System.out.println("Carro Parado!");
                }
                System.out.println("Velocidade Atual: " + this.velocidade + "Km");
            }
        } else {
            System.out.println("\nNão é possível frear um carro desligado!");
        }
    }

    public double calcularCustoParaEncherTanque(double precoGasolina) {
        return getCapacidadeTanque() * precoGasolina;
    }
}
