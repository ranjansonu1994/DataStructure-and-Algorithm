package TimeComplexityPractice;

public class ArrayPairPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,3,4,5};
          new ArrayPairPrint().arrayPairPrint(array);
	}
	
	public void arrayPairPrint(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				System.out.print(10*array[i]+array[j]+" ");
			}
			System.out.println();
		}
	}

}
