package multiplicçãoDeMatriz;
import java.util.Scanner;
public class MultiplicaçãoMatriz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] login = new String[6][2];
		
		//Login e senha
		login[0][0] = "Usuario1";
		login[0][1] = "Senha1";
		
		login[1][0] = "Usuario2";
		login[1][1] = "Senha2";
		
		login[2][0] = "Usuario3";
		login[2][1] = "Senha3";
		
		login[3][0] = "Usuario4";
		login[3][1] = "Senha4";
		
		login[4][0] = "Usuario5";
		login[4][1] = "Senha5";
		
		login[5][0] = "Usuario6";
		login[5][1] = "Senha6";
		
		//Inserindo credenciais de login
		System.out.print("Login: ");
		String loginUser = scan.nextLine();
		
		System.out.print("Senha: ");
		String passUser = scan.nextLine();
		
		boolean encontrado = false;
		
		for(int i = 0; i < 6; i++) {
			if(login[i][0].equalsIgnoreCase(loginUser) && login[i][1].equalsIgnoreCase(passUser)){
				
				System.out.println("Login e senha corretos!");
				encontrado = true;
				break;
			}
		}
		if(!encontrado) {
			System.out.println("Login e senha incorretos!"); 
		}
		
		scan.close();
	}


	}


