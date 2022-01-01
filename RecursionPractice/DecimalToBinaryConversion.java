
public class DecimalToBinaryConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new DecimalToBinaryConversion().decToBinary(5));
	}
	
	public int decToBinary(int n)
	{
		if(n==0)
		{
			return 0; 
		}
		return n%2+10*decToBinary(n/2);
	}

}
