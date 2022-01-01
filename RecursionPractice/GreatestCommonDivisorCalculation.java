
public class GreatestCommonDivisorCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new GreatestCommonDivisorCalculation().greatestCommonDivisor(11, -99));
	}

	public  int greatestCommonDivisor(int a, int b) {
	 
		if (b == 0) {
			return a;
		}
		
			return greatestCommonDivisor(b, a % b);
		
		
	}

}
