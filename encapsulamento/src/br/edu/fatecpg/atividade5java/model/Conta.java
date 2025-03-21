package br.edu.fatecpg.atividade5java.model;

public class Conta {
	private int agencia;
	private int conta;
	private String nomeCliente;
	private double saldo = 0;
	private double chequeEspecial = 500;
	
	public Conta(int ag, int conta, String nome) {
		this.agencia = ag;
		this.conta = conta;
		this.nomeCliente = nome;
	}
	
	public void setAgencia(int ag) {
		this.agencia = ag;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public int getConta() {
		return this.conta;
	}
	
	public void setNomeCliente(String nome) {
		if(nome.length() < 2) {
			this.nomeCliente = nome;
		}
		else {
			System.out.println("Nome Invalido!");
		}
	}
	
	public String getNomeCliente() {
		return this.nomeCliente;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public double getChequeEspecial() {
        return this.chequeEspecial;
    }

    public double sacar(double valor) {
        if (valor <= saldo) { 
            saldo -= valor;
        } else {
            double restante = valor - saldo;
            if (restante <= chequeEspecial) {
                saldo = 0;
                chequeEspecial -= restante;
            } else {
                System.out.println("Saque negado! Valor ultrapassa o limite do cheque especial.");
                return saldo;
            }
        }
        return saldo;
	}
}
