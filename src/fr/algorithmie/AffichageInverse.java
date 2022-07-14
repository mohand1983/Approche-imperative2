package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {

	public static void main(String[] args) {
		
		//Tableau
		int[] tab = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		//Affichage de toutes les valeurs du tableau
		for (int valeurs : tab) {
			System.out.println(valeurs);
			
		}
		//Affichage d'un tableau renversé
		 for(int i=0; i< tab.length/2; i++){
		        int tmp = tab[i];
		        tab[i] = tab[tab.length-i-1];
		        tab[tab.length-i-1] = tmp;
		    }
		    System.out.println("Tableau après l'inversion: " + Arrays.toString(tab));
		    
		//Copier le tableau tab dans le tableau tableauCopy avec la méthode copyOf 
		    
		    int[] tableauCopy = Arrays.copyOf(tab, tab.length);

	        for (int i = 0; i < tableauCopy.length; i++) {
	            System.out.println("tableauCopy position " + i + ": " + tableauCopy[i]);
	        }
		

	}

}


