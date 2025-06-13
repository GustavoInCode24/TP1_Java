package br.edu.fatecpg.model;

public class Endereco {

	private String cep;
	private String rua;
	private String num;
	private String bairro;
	
	public Endereco(String cep, String rua, String num, String bairro) {
		super();
		this.cep = cep;
		this.rua = rua;
		this.num = num;
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", rua=" + rua + ", num=" + num + ", bairro=" + bairro + "]";
	}
	
	
	
}
