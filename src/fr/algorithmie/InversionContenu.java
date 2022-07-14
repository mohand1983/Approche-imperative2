package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {

	public static void main(String[] args) {
		// tableau de départ 
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		for(int i=0; i<array.length; i++) {
			
		}
		System.out.println("Tableau après l'inversion: " + Arrays.toString(array));
		// Copier le tableau dans autre tableau
		int[] tabCopy=Arrays.copyOf(array, array.length);
		//for(int i=0; i<tabCopy.length; i++) {
		for(int i=0; i< tabCopy.length/2; i++){
	        int tmp = tabCopy[i];
	        tabCopy[i] = tabCopy[tabCopy.length-i-1];
	        tabCopy[tabCopy.length-i-1] = tmp;
	    
			
		}
		System.out.println("Tableau après l'inversion: " + Arrays.toString(tabCopy));
		
	}

}
