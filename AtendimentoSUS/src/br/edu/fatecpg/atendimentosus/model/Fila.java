package br.edu.fatecpg.atendimentosus.model;

public class Fila {
	public int qtdFila;
	
	public Fila(int qtdFila) {
		this.qtdFila = qtdFila;
	}
	
	public int getQtdFila() {
 		return qtdFila;
 	}
 
 	public void setQtdFila(int qtdFila) {
 		this.qtdFila = qtdFila;
 	}
 	
 	public void chamarPaciente(int paciente) {
 		if (paciente < 3 || paciente > 0) {
 			System.out.println("Atendido " + paciente + " pacientes.");
 			qtdFila -= paciente;
 		}
 		if (paciente > 2){
 			System.out.println("O consultório só permite atender até 2 pacientes por vez!");
 		}
 		if (paciente <= 0) {
 			System.out.println("A fila está vazia!");
 		}
 	}
 	
 	public void pacienteEntraFila(int paciente) {
 		qtdFila += paciente;
 	}
}
