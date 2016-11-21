package Algorithm;

/*
 * Find out middle index where sum of both ends are equal.
 */

public class BothEndEqualIndex {

	public static int findPosition(int[] array) {
		int sumLeft, sumRight, i, j;

		if (array.length == 1) {
			return 0;
		} else {	
			
			sumLeft = array[0]; 
			sumRight = array[array.length - 1];
			i = 1; 
			j = array.length - 2;
			
			while (i <= j) {
				if (sumLeft > sumRight) {
					sumRight += array[j];
					j--;
				} else if (sumLeft < sumRight) {
					sumLeft += array[i];
					i++;
				} else {
					sumRight += array[j];
					sumLeft += array[i];
					i++;
					j--;
				}
			}

			if (sumLeft == sumRight) {
				return --i;
			} else
				return -1;
		}
	}

	public static void main(String[] args) {
		// int[] array = {1,2,3,4,5,6,7,7};
		int[] array = { 1,1,3,-1,3 };
		System.out.println(findPosition(array));
	}
}
