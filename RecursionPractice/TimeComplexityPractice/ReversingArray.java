package TimeComplexityPractice;

public class ReversingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4 ,5};
		int[] reverseArray=reverseArray(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(reverseArray[i]);
		}
	}

	public static int[] reverseArray(int[] array) {

		for (int i = 0; i < array.length/2; i++) {

			int temp = array[i];
			array[i] = array[(array.length - 1) - i];
			array[(array.length - 1) - i] = temp;

		}
		return array;

	}
}
