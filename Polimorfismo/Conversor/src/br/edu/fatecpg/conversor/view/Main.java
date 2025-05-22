package br.edu.fatecpg.conversor.view;
import br.edu.fatecpg.conversor.model.Conversor;
public class Main {

	public static void main(String[] args) {
	
		Conversor cv = new Conversor ();
		
		 double tempCelsius = 25;
        System.out.println(tempCelsius + "°C = " + cv.converter(tempCelsius) + "°F");

    
        double distanciaKm = 10;
        System.out.println(distanciaKm + " km = " + cv.converter(distanciaKm, true) + " milhas");

    
        String texto = "teste de string";
        System.out.println("'" + texto + "' em maiúsculas = '" + cv.converter(texto) + "'");

	}

}
