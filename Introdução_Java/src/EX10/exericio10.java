package EX10;
import java.util.Scanner;
public class exericio10 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
	
		String senha = "java123",senha2;
		
		System.out.println("DIgite a senha:");
		
		
			while(true)
			{
			senha2 =scan.nextLine();
			
			if (senha2.equals(senha)) {
                System.out.println("Senha correta! Acesso concedido.");
            }
			
			else {
                System.out.println("Senha incorreta. Tente novamente.");
            	}
			}
	}

}
