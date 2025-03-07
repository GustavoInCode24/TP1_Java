package EX8;
import java.util.Scanner;
public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int num, soma=0;
		
		System.out.println("Digite um numero: ");
		num = scan.nextInt();
		
		for(int i=1;i<= num *2;i+=2) {
			soma +=i;
		}
		
		
		System.out.println("A soma dos primeiros " + num + " números ímpares é: " + soma);

	}

}
