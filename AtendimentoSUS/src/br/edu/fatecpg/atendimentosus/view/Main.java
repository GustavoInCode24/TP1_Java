package br.edu.fatecpg.atendimentosus.view;
import br.edu.fatecpg.atendimentosus.model.Fila;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Total pacientes na fila: ");
		int qtdFila = scanner.nextInt();
		System.out.println("Quantos pacientes serão atendidos: ");
		int pacienteAtendido = scanner.nextInt();
		
		Fila sus = new Fila(qtdFila);
		
		sus.chamarPaciente(pacienteAtendido);
		System.out.println("Total pacientes na fila: " + sus.getQtdFila());
		
		System.out.println("Quantos pacientes entraram na fila: ");
		int entrarFila = scanner.nextInt();
		sus.pacienteEntraFila(entrarFila);
		System.out.println("Total pacientes na fila: " + sus.getQtdFila());
	}

}
