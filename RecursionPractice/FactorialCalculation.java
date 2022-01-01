
public class FactorialCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = new FactorialCalculation().factorial(5);
		System.out.println("factorial Result when n = 5 : "+result);
	}

	public int factorial(int n) {
		// infinte loop break condition
		if (n == 0 || n == 1) {
			return 1;
		}
		//Other unexpected arguments
		
		if(n<0)
		{
			System.out.println("Factorial calculation only when number >=0");
			return -1;
		}
		// base formula
		System.out.println("factorial("+n+"-1)" + " function is called");
		return n * factorial(n - 1);
		
	}

}
