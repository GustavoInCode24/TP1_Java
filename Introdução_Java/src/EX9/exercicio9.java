package EX9;
import java.util.Scanner;
public class exercicio9 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		String[] nomes =new String[5];
		
		System.out.println("Digite cinco nomes: ");
		 
		 System.out.println("Digite 5 nomes:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Nome " + (i + 1) + ": ");
	            nomes[i] = scan.nextLine();
	        }

	        System.out.print("Digite outro nome: ");
	        String nomeProcurado = scan.nextLine();

	        boolean encontrado = false;
	        for (int i = 0; i < 5; i++) {
	            if (nomes[i].equalsIgnoreCase(nomeProcurado)) {
	                encontrado = true;
	                break;
	            }
	        }

	        if (encontrado) {
	            System.out.println("O nome " + nomeProcurado + " está na lista.");
	        } else {
	            System.out.println("O nome " + nomeProcurado + " não está na lista.");
	        }
		
	}

}
