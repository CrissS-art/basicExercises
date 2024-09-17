import java.util.*;

public class BaseEx63Operation {
//	• 6.3 : Écrire un code qui doit, pour un tableau contenant X nombres donné, 
//	retourner la 
//	somme des 2 plus grands nombres présent dans ce tableau. Exemple : avec le 
//	tableau 78, 6, -
//	250, 2, 12, 9, le résultat sera 90.

	public static void main(String[] args) {
/* 6.3 : Écrire un code qui doit, pour un tableau contenant X nombres donnés, retourner la 
somme des 2 plus grands nombres présent dans ce tableau. Exemple : avec le tableau 78, 6, -
250, 2, 12, 9, le résultat sera 90.
*/
		int numberArray[] = { 78, 6, -250, 2, 12, 9 };
		int sortedArray[] = Arrays.copyOf(numberArray, numberArray.length);
		
		Arrays.sort(sortedArray);
		System.out.println("Tableau trié : " + Arrays.toString(sortedArray));
		
		int sumOfLargest = sortedArray[sortedArray.length - 1] +
				sortedArray[sortedArray.length - 2];
		System.out.println("La somme des deux plus grands nombres est : " + sumOfLargest);
	}

}
