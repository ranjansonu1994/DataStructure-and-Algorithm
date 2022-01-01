
public class ArrayValuesSumAndProductCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] array= {10,10,10,10,60};
     System.out.println(new ArrayValuesSumAndProductCalculation().sumArrayValues(array, 4));
     System.out.println(new ArrayValuesSumAndProductCalculation().mulArrayValues(array, 4));
	}
	
	public int sumArrayValues(int array[],int n)
	{
		if(n==0)
		{
			return array[0];
		}
		return array[n]+sumArrayValues(array, n-1);
	}
	
	public int mulArrayValues(int array[],int n)
	{
		if(n==0)
		{
			return array[0];
		}
		return array[n]*mulArrayValues(array, n-1);
	}

}
