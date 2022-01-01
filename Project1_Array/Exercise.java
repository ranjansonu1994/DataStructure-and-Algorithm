import java.util.Arrays;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		int[] duplicates= {1,1,2,2,3,4,5,6};
		int[] nums= {2,4,3,5,6,-2,4,7,8,9};
		//System.out.println(Arrays.deepToString(array1));
		//int[][] firstTranspose=new Exercise().arrayTranspose(matrix);
		
		//int[][] secondTranspose=new Exercise().circularTranspose(firstTranspose);
		
    // System.out.println(Arrays.deepToString(secondTranspose));
		//System.out.println(Arrays.toString(removeDuplicates(duplicates)));
		System.out.println(Exercise.twoSum(nums, 7));
	}
	public static String twoSum(int[] nums, int target) {
	    // TODO
		
		int[][] res=new int[nums.length][2];
		int k=0;
		String result="";
		for(int i=0;i<nums.length;i++)
		{
			int flag=0;
			int diff=target-nums[i];
			
			for(int j=i+1;j<nums.length;j++)
			{
			if(nums[j]==diff)
			{
				result=result+nums[i]+":"+nums[j]+" ";
			}
			}
			
		}
		return result;
	}
	
	public String maxProduct(int[] nums)
	{
		int MAX=0;
		int MUL=0;
		int I=0;
		int J=0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				MUL=nums[i]*nums[j];
				if(MUL>MAX)
				{
					MAX=MUL;
					I=nums[i];
					J=nums[j];
				}
			}
		}
		String res=I+","+J;
		return res;
	}
	
	public boolean isUnique(int[] intArray) {
        // TODO
		boolean res=false;
		for(int i=0;i<intArray.length;i++)
		{
			for(int j=i+1;j<intArray.length;j++)
			{
				if(intArray[i]==intArray[j])
				{
					res=true;
					break;
				}
				else
				{
					res=false;
				}
			}
			if(res==true)
			{
				break;
			}
		}
		
		return res;
    }
	public boolean permutation(int[] array1 ,int[] array2)
	{
		boolean res=false;
		int count=0;
		if(array1.length==array2.length)
		{
			for(int i=0;i<array1.length;i++)
			{
				count=0;
				for(int j=0;j<array2.length;j++)
				{
					if(array1[i]==array2[j])
					{
						count++;
					}
				}
				if(count==0 ||count>1)
				{
					res=false;
				}
				else
				{
					res=true;
				}
			}
		}
		else
		{
			res=false;
		}
		return res;
	}
	
	public int[][] arrayTranspose(int[][] array1)
	{
		int[][] transposeArray=new int[array1.length][array1[0].length];
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1[i].length;j++)
			{
				transposeArray[j][i]=array1[i][j];
			}
		}
		return transposeArray;
	}
	public int[][] circularTranspose(int[][]array1)
	{
		//int[][] transposeArray=new int[array1.length][array1[0].length];
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1[i].length;j++)
			{
				int temp=array1[i][0];
				array1[i][0]=array1[i][2];
				array1[i][2]=temp;
			}
		}
		return array1;	
	}
	
	
		  public static int[] removeDuplicates(int[] arr) {
		    //   TODO
		    int temp=0;
		    int[] newarr=new int[100];
		    
		    int k=0;
		    for(int i=0;i<arr.length;i++)
		    {
		        if(temp!=arr[i])
		        {
		          newarr[k]=arr[i];
		          temp=arr[i];
		          k++;
		        }
		    }
		    int[] uparr=new int[k];
		    for(int i=0;i<k;i++)
		    {
		        uparr[i]=newarr[i];
		    }
		    return uparr;
		  }

		


}
