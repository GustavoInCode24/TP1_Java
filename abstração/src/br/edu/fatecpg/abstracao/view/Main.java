package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Smartfone; 
import br.edu.fatecpg.abstracao.model.ViaLactea;
import br.edu.fatecpg.abstracao.model.CameraDigital;
import br.edu.fatecpg.abstracao.model.Elefante;
import br.edu.fatecpg.abstracao.model.Carro;
import br.edu.fatecpg.abstracao.model.Motocicleta;
import br.edu.fatecpg.abstracao.model.ImperioRomano;
import br.edu.fatecpg.abstracao.model.Aviao;
import br.edu.fatecpg.abstracao.model.Fotossintese;
import br.edu.fatecpg.abstracao.model.Danca;
import br.edu.fatecpg.abstracao.model.IdadeBronze;
import br.edu.fatecpg.abstracao.model.PiramidesEgito;
import br.edu.fatecpg.abstracao.model.ChefCozinha;
import br.edu.fatecpg.abstracao.model.Galaxia;
public class Main {

	public static void main(String[] args) {
	
		//Smartfone
		Smartfone meuSmartphone = new Smartfone("Samsung", "Galaxy S23", 256);

        
        meuSmartphone.fazerLigacao("11 99999-9999");
        meuSmartphone.tirarFoto();
        meuSmartphone.instalarAplicativo("Instagram");
        
        //viaLactea
        
        ViaLactea viaLactea = new ViaLactea("Espiral", 1000000000000L, 100000.0);
       
       //Camera digital 
        CameraDigital novaCameraDigital = new CameraDigital ("Soni", 1280 ,35 );
        
        
        //Elefante
        Elefante meuElefante = new Elefante ("Fanfy",3,100);
        
        
        //carro
        Carro meuCarro = new Carro ("Fiat", "Palio", 2020);
         
        meuCarro.ligar();
        
        //motocicleta
        
        Motocicleta minhaMotocicleta = new Motocicleta ("Honda","Cb300",300);
         
        minhaMotocicleta.ligar();
        
        //imperio Romano
        
        ImperioRomano meuImperioRomano = new ImperioRomano ("Adolfo",1802,1000);
        
        //aviao
        
        Aviao meuAviao = new Aviao ("GolMaria",137,100);
        
       //Fotossintese
        
        Fotossintese novaFotossintese = new Fotossintese (100,40,30);
        
        //danca
        
        Danca novaDanca = new Danca ("Maria","Hip Hop",3);
        
        //IdaddeBronze
        
        IdadeBronze eraIdadeBronze = new IdadeBronze (1989,1987,1983);
        
        eraIdadeBronze.desenvolver();
        
        //Piramides Egito
        
        PiramidesEgito eraPiramidesEgito = new PiramidesEgito ("esfinge","tutancamon","macacos");
        
        eraPiramidesEgito.servir();
        
        //chef cozinha
        
        ChefCozinha novoChefCozinha = new ChefCozinha ("Hugo","Pantierri","Bife");
        
        novoChefCozinha.preparar();
        
        //Galaxia
        
        Galaxia novaGalaxia = new Galaxia ("sistema Solar","Espiral",1000);
        
        novaGalaxia.expandir();
	}

}
