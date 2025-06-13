package br.edu.fatecpg.view;
import br.edu.fatecpg.model.Endereco;
import br.edu.fatecpg.model.Cliente;
public class Main {

	public static void main(String[] args) {
		
		Endereco end = new Endereco ("11703-222","Rua X","10A","Boqueirão");
		
		Cliente cliente = new Cliente ("Ale",31,777,5000,end);
		
		System.out.println(cliente.toString());
	}

}
