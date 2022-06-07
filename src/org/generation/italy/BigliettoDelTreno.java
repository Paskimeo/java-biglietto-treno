package org.generation.italy;

import java.util.Scanner;

public class BigliettoDelTreno {

	public static void main(String[] args) {
		
		    int eta;
		    int kilometri;
		    Scanner scan = new Scanner(System.in);

		    System.out.print("Inserisci la tua età: ");
		    eta = scan.nextInt();
		    System.out.print("Inserisci kilometri da percorrere: ");
		    kilometri = scan.nextInt();

		    
		    System.out.println("Età: " + eta);
		    System.out.println("kilometri scelti: " + kilometri);

		    float costoBiglietto = kilometri * 0.21;
		    System.out.println("costo del biglietto: " + costoBiglietto);
		    
		    if(eta < 18) {
		    	double costoBigliettoGiovani = costoBiglietto - costoBiglietto * 20 / 100;
		    	System.out.println("prezzo con lo sconto young: " + costoBigliettoGiovani);
		      
		    }else if (eta > 65) {
		    	double costoBigliettoAnziani = costoBiglietto - costoBiglietto * 40 / 100;
		    	System.out.println("prezzo con lo sconto young: " + costoBigliettoAnziani);
		    }
		    
		    
		    scan.close();
	}

}
