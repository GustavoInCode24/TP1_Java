package EX5;
import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {
		
	Scanner scan= new Scanner(System.in);
		
		int num  ;
		
		System.out.println("Digite um numero: ");
		num = scan.nextInt();
		
		num = num % 2;
		
		if(num == 0) {
			System.out.println("Esse numero é par");
		}
		else {
			System.out.println("Esse numero é impar");
		}
		

	}

}
