package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableaux {

	public static void main(String[] args) {
		// Créer une classe SommeDeTableaux
		// int[] array1={1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		// int[] array2={-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
		int[][] tableau = { { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 },
				{ -1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1 } };

		// Créer un tableau qui contient la somme des 2 précédents tableaux
		 
		for(int i=0; i<tableau.length; i++)
		{
			   for(int j=0; j<tableau[i].length; j++)
			   {
				int somme=0;
			    somme += tableau[i][j]; 
			    System.out.println(somme);
			   }
			  
			   
		}
		
	}

}
