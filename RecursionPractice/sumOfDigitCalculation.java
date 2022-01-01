
public class sumOfDigitCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new sumOfDigitCalculation().sumOfDigit(-7));

	}
	public int sumOfDigit(int n)
	{
		if(n>=0 && n<10)
		{
			return n;
		}
		if(n<0)
		{
			return -1;
		}
		return n%10+sumOfDigit(n/10);
	}

}
