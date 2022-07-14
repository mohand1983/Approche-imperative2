package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		// Tableau
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		// Combiner une boucle et un test de manière à n’afficher que les entiers
		// supérieurs à 3
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];
			if (temp >= 3) {
				System.out.println(temp);
			}
		}
		// Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		System.out.println("Les entiers pairs");
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];
			if (temp % 2==0) {
				System.out.println(temp);
			}
		}
		/*Combiner une boucle et un test de manière à n’afficher 
		que les valeurs correspondant aux index pairs*/
		System.out.println("Les valeurs des index  pairs");
		for (int i = 0; i < array.length; i++) {
			//int temp = array[i];
			if (i % 2==0) {
				System.out.println(i);
			}
		}
		/*Combiner une boucle et un test de manière
		 *  à n’afficher que les entiers impairs
		 */
		System.out.println("Les entiers impairs");
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];
			if (temp % 2==1) {
				System.out.println(temp);
			}
		}
		
		
		

	}

}
