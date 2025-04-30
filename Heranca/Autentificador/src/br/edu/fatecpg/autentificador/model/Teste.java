package br.edu.fatecpg.autentificador.model;

public class Teste implements Autenticavel{

	
	public String senha;
	public String usuario;
	public boolean autentificador;
	
	
	public Teste(String senha,String usuario ) {
		
		this.senha = senha;
		this.usuario = usuario;
		
	}
	
	
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
