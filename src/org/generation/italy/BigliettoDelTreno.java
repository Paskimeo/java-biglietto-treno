package org.generation.italy;

import java.text.DecimalFormat;
import java.util.Scanner;


public class BigliettoDelTreno {

	public static void main(String[] args) {
		
		
		
		    int eta;
		    int kilometri;
		    Scanner scan = new Scanner(System.in);
		    DecimalFormat df = new DecimalFormat(".00");

		    System.out.print("Inserisci la tua età: ");
		    eta = scan.nextInt();
		    System.out.print("Inserisci kilometri da percorrere: ");
		    kilometri = scan.nextInt();

		    
		    System.out.println("Età: " + eta);
		    System.out.println("kilometri scelti: " + kilometri);

		    float costoBiglietto = kilometri * 0.21f;
		    System.out.println("costo del biglietto: " + df.format(costoBiglietto));
		    
		    if(eta < 18) {
		    	float costoBigliettoGiovani = costoBiglietto - costoBiglietto * 20 / 100;
		    	System.out.println("prezzo con lo sconto young: " + df.format(costoBigliettoGiovani));
		      
		    }else if (eta > 65) {
		    	float costoBigliettoAnziani = costoBiglietto - costoBiglietto * 40 / 100;
		    	System.out.println("prezzo con lo sconto young: " + df.format(costoBigliettoAnziani));
		    }
		    
		    
		    scan.close();
	}

}
