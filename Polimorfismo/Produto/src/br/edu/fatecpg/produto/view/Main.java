package br.edu.fatecpg.produto.view;
import br.edu.fatecpg.produto.model.Produto;
public class Main {

	public static void main(String[] args) {

	
		Produto produto1 = new Produto ("borracha");
		Produto produto2  = new Produto ("caneta",5,0);
		Produto produto3 = new Produto ("lapis",2.0,10);
		
		System.out.println(produto1.nome);
		System.out.println(produto2.nome + " - R$: " + produto2.preco);
		System.out.println(produto3.nome +  " - R$: " + produto3.preco +  " - Estoque:" + produto3.estoque );
		
		
	}		

}
