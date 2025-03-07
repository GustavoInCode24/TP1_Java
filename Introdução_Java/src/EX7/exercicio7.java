package EX7;
import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int ano_atual;
		
		System.out.println("Digite sua idade ");
		ano_atual = scan.nextInt();
		
		if(ano_atual < 18) {
			System.out.println("Menor de idade");
		}
		else if(ano_atual < 60) {
			System.out.println("adulta");
		}
		else {
			System.out.println("Idosa");
		}
		
	}

}
