package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		// tableau
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		// Rechercher le plus grand élément du tableau

		int maxNum = array[0];
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];
			if (temp > maxNum) {
				maxNum = temp;
			}
		}
		System.out.println(maxNum);
	}

}
