package BubbleSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,9,3,1,2,8,4,7,6};
		BubbleSort.bubbleSortAscending(arr);
		System.out.println(Arrays.toString(arr));
		BubbleSort.bubbleSortDecending(arr);
		System.out.println(Arrays.toString(arr));

	}

}
