
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] intArray= {1,2,3,4,5,6,8,9,10};
    missingNumber(intArray);
	}
	 public static void missingNumber(int[] intArray) {
	        // TODO
	        int flag=0;
	        int sumArray=0;
	        int sum=0;
	        int missing=0;
	        for(int i=0;i<intArray.length;i++)
	        {
	        	sumArray=sumArray+intArray[i];
	        }
	        
	       sum=55;
	       missing=sum-sumArray;
	       System.out.println(missing);
	       
	    }


}
