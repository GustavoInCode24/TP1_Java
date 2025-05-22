package br.edu.fatecpg.conversor.model;

public class Conversor {

    public double converter(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

   
    public double converter(double km, boolean isKmToMiles) {
        if (isKmToMiles) {
            return km * 0.621371;
        } else {
           
            throw new IllegalArgumentException("Parâmetro booleano deve ser true para conversão de km para milhas.");
        }
    }

    
    public String converter(String texto) {
        return texto.toUpperCase();
    }
	
	
}
