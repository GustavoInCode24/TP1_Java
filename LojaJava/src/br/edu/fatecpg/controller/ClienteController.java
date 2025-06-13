EnderecoController.java
package br.edu.fatecpg.loja.controller;
import java.util.ArrayList;
import java.util.List;

import br.edu.fatecpg.loja.model.Cliente;
import br.edu.fatecpg.loja.model.Endereco;

public class EnderecoController {
	private List<Endereco> enderecos = new ArrayList<>();
	
	public void setEndereco(String cep, String rua, String num, String bairro) {
		Endereco end = new Endereco(cep, rua, num, bairro);
		enderecos.add(end);
	}
	
	public Endereco getEndereco(int index) {
		return enderecos.get(index);
	}
	
	public String getLista() {
		StringBuilder sb = new StringBuilder();
		System.out.print("\n");
		for(int i = 0; i < enderecos.size(); i++) {
			sb.append(enderecos.get(i).toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}
