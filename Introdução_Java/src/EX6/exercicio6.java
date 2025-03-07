package EX6;
import java.util.Scanner;
public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int num,i,r=1;
		
		System.out.println("DIgite um numero: ");
		num =scan.nextInt();
			
		for(i=1;i<=num ;i++) {
			
			r *= i;	
		}
			System.out.println("O fatorial de " + num + " é:" + r);	

	}

}
