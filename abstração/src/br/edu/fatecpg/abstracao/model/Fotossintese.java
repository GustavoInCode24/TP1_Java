package br.edu.fatecpg.abstracao.model;

public class Fotossintese {
	 private double intensidadeLuz;
	    private double temperatura;
	    private double concentracaoCO2;

	    
	    public Fotossintese(double intensidadeLuzInicial, double temperaturaInicial, double concentracaoCO2Inicial) {
	        intensidadeLuz = intensidadeLuzInicial;
	        temperatura = temperaturaInicial;
	        concentracaoCO2 = concentracaoCO2Inicial;
	    }

	    public double calcularTaxaFotossintese() {
	        double taxa = intensidadeLuz * (temperatura / 25) * (concentracaoCO2 / 400);
	        return taxa;
	    }

	    public void aumentarIntensidadeLuz(double aumento) {
	        intensidadeLuz += aumento;
	    }

	    public void exibirCondicoes() {
	        System.out.println("Intensidade da luz: " + intensidadeLuz + " unidades");
	        System.out.println("Temperatura: " + temperatura + " °C");
	        System.out.println("Concentração de CO2: " + concentracaoCO2 + " ppm");
	    }
}
