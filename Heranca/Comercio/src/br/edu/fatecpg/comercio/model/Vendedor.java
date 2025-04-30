package br.edu.fatecpg.funcionario.model;

public class Vendedor implements Funcionario {

	public void baterPonto() {
		
		System.out.println("Ponto Registrado!! ");
	}
	
	public void solicitarMaterial() {
		
		System.out.println("Material Solicitado!! ");
	}
	
	public void realizarVenda() {
		
		System.out.println("Venda Realizada!!");
	}
}
