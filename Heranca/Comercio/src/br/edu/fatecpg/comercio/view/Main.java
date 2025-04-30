package br.edu.fatecpg.funcionario.view;
import br.edu.fatecpg.funcionario.model.*;

public class Main {

	public static void main(String[] args) {
		
		Faxineiro f = new Faxineiro();
		
		f.baterPonto();
		
		System.out.println();
		
		Gerente g = new Gerente();
		
		g.fecharCaixa();
		
		System.out.println();
		
		Vendedor v = new Vendedor();
		
		v.realizarVenda();
	}

}
