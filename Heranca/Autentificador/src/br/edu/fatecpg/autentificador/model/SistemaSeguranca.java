package br.edu.fatecpg.autentificador.model;

public class SistemaSeguranca implements Autenticavel {

	public String senha = "1234";
	public String usuario = "admin";
	public boolean autentificador;
	
	
	@Override
	public void login() {
	
		if(senha == "1234" && usuario == "admin") {
			
			autentificador = true;
			
			System.out.println("boas vindas!");
			
		}
		else {
			
			autentificador = false;
			
			System.out.println("Falha no Login!");
		}
			
	}

	@Override
	public void logout() {
		
		autentificador = false;
		
		System.out.println("Logout realizado com sucesso.");
		
	}
		
	
}
