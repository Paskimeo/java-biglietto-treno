package org.generation.italy;

import java.util.Scanner;

public class BigliettoDelTreno {

	public static void main(String[] args) {
		
		    int eta;
		    int kilometri;
		    Scanner scan = new Scanner(System.in);

		    System.out.print("Inserisci et�: ");
		    eta = scan.nextInt();
		    System.out.print("Inserisci kilometri da percorrere: ");
		    kilometri = scan.nextInt();

		    
		    System.out.println("Et�: " + eta);
		    System.out.println("kilometri scelti: " + kilometri);

		    
		    scan.close();
	}

}
