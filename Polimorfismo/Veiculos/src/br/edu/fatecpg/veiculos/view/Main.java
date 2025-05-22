package br.edu.fatecpg.veiculo.view;
import br.edu.fatecpg.veiculo.model.Carro;
import br.edu.fatecpg.veiculo.model.Bicicleta;
public class Main {

	public static void main(String[] args) {
		
		Carro nc = new Carro ();
		String r = nc.mover();
		System.out.println(r);
		
		Bicicleta bc = new Bicicleta ();
		String p = bc.mover();
		System.out.println(p);
		
	}

}
