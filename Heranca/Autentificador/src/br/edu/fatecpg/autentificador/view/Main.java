package br.edu.fatecpg.autentificador.view;
import br.edu.fatecpg.autentificador.model.Teste;
public class Main {

	public static void main(String[] args) {
		
		Teste t = new Teste ("1234","admin"); 
		
		t.login();
		t.logout();
		
	}

}
