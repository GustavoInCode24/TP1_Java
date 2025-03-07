package EX1;
import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero: ");
		num =scan.nextInt();
		

		if(num > 0) {
			System.out.println("É positivo");
		}
		else {
			System.out.println("É negativo");
		}

	}

}
