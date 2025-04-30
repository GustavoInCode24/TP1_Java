package br.edu.fatecpg.funcionario.model;

public class Gerente implements Funcionario  {

	public void baterPonto() {
		
		System.out.println("Gerente não bate Ponto!!");
	}
	
	public void solicitarMaterial() {
		
		System.out.println("Material Solicitado!!");
	}
	
	public void fecharCaixa() {
		
		System.out.println("Caixa Fechado!!");
	}
}
