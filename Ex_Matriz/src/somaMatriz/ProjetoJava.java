package Projeto;
import java.util.Scanner;
public class ProjetoJava {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);	
		
	double[][] m1 = new double [3][3]; 
	double[][] m2= new double [3][3];
	double [][] matriztotal = new double [3][3]; ;
	int l,c ;
	
	 System.out.println("Digite os elementos da primeira  matriz  ");
	for(l=0;l<3;l++) {
		for(c=0;c<3;c++) {	
		m1 [l] [c] = scan.nextDouble();
		}
	}
	
	 System.out.println("Digite os elementos da seguinda matriz  ");
	 for(l=0;l<3;l++) {
		for(c=0;c<3;c++) {	
		m2 [l] [c] = scan.nextDouble();
		}
	}
	
	 for (l = 0; l < 3; l++) {
         for (c = 0; c < 3; c++) {
             matriztotal[l][c] = m1[l][c] + m2[l][c];
         }
     }
	 
	 for (l = 0; l < 3; l++) {
		 for(c=0;c<3;c++) {
        	  System.out.print(matriztotal[l][c] + " "  );
        }
        System.out.println();
       }
		
	}

}
