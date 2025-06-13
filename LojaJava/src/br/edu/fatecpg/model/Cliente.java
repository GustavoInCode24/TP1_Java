package br.edu.fatecpg.model;

public class Cliente extends Pessoa {

	private int codigo;
	private double credito;
	private Endereco end;
	
	public Cliente(String nome, int id,double crd,int cd,Endereco end) {
		super(nome, id);
		this.credito = crd;
		this.codigo = cd;
		this.end = end;
	}
	
	public static final String mostrar() {
		return "Metodo final";
	}

	@Override
	public String toString() {
		return "Cliente [Nome: " +this.getNome() + 
				", idade: " + this.getIdade()+
				", codigo: " + codigo + 
				", credito: " + credito + 
				", end: " + end + "]";
	}

	
}
