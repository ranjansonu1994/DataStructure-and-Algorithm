package BubbleSort;

public class BubbleSort {

	public static int[] bubbleSortAscending(int[] unsortedArray) {

		for (int i = 0; i < unsortedArray.length; i++) {
			for (int j = 0; j < unsortedArray.length; j++) {
				if (j < unsortedArray.length - 1) {
					if (unsortedArray[j] > unsortedArray[j + 1]) {
						int temp = unsortedArray[j];
						unsortedArray[j] = unsortedArray[j + 1];
						unsortedArray[j + 1] = temp;
					}
				}
			}
		}

		return unsortedArray;
	}
	
	public static int[] bubbleSortDecending(int[] unsortedArray) {

		for (int i = 0; i < unsortedArray.length; i++) {
			for (int j = 0; j < unsortedArray.length; j++) {
				if (j < unsortedArray.length - 1) {
					if (unsortedArray[j] < unsortedArray[j + 1]) {
						int temp = unsortedArray[j];
						unsortedArray[j] = unsortedArray[j + 1];
						unsortedArray[j + 1] = temp;
					}
				}
			}
		}

		return unsortedArray;
	}

}
