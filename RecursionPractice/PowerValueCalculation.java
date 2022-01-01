
public class PowerValueCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(new PowerValueCalculation().powerValue(2, 2));	

	}
	
	public int powerValue(int pow , int n)
	{
		if(pow==0)
		{
			return 1;
		}
		if(pow<0 ||n<0)
		{
			return -1;
		}
		return n*powerValue(pow-1, n);
	}

}
