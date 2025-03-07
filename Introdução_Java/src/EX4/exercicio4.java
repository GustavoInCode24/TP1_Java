package EX4;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int i,numero,resultado  ;
		
		System.out.println("digite um numero de 1 A 10:");
		numero =scan.nextInt();
	
		for(i=1;i<=10;i++) {
			resultado = numero * i;
			
			System.out.println(numero + " x " + i  + " = " + resultado);
		}
		
	}
	

}
