
public class FiboniacciCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fiboniacciResult=new FiboniacciCalculation().fiboniacci(8);
		System.out.println(fiboniacciResult);

	}
    public int fiboniacci(int n)
    {
    	// infinte loop break condition
    	if(n==0)
    	{
    		return 0;
    	}
    	if(n==1)
    	{
    		return 1;
    	}
    	//Other unexpected arguments
    	if(n<0)
    	{
    		return -1;
    	}
    	//base formula
    	return fiboniacci(n-1)+fiboniacci(n-2);
    	
    }
}
