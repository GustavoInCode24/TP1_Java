package EX2;
import java.util.Scanner;
public class execicio2 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int n1,n2 ;
		
		System.out.println("Digite o primeiro numero: ");
		n1 =scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		n2 =scan.nextInt();

		if(n1 == n2 ) {
			System.out.println("Os numeros são iguais ");
		}
		else if(n1 < n2) {
			System.out.println("O segundo número é maior ");
		}
		else  {
			System.out.println("O primeiro número é maior ");
		}
	}

}
