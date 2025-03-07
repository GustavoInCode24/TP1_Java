package EX3;
import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		int opcao;
		double n1,n2,a,raio,ac;
		System.out.println("1. Área do quadrado ");
		System.out.println("2. Área do circulo");
		
		opcao = scan.nextInt();
		
		switch(opcao){
			case 1 :
			System.out.print("digite o primeiro numero: ");
			n1 = scan. nextDouble();
			
			System.out.print("digite o segundo numero: ");
			n2 = scan.nextDouble();
			
			a = n1 * n2;
			
			System.out.print("o resultado é: " + a );
			break;
			
			case 2:
			System.out.print("digite o valor do raio  ");
			 raio= scan. nextDouble();
			
			 ac = Math.PI * raio* raio;
			 
			 System.out.print("Á area do circulo é : " + ac);
			 
			 break;
			
		}
	}

}
