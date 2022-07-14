package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		//Tableau
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		//Rechercher le plus petit élément du tableau
		int valMin=array[0];
		for(int i=0; i<array.length;i++) {
			if(valMin<array[i]) {
				array[i]=valMin;
			}
		}
		System.out.println(valMin);

	}

}
