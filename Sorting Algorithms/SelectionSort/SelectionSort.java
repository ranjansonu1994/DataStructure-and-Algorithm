package SelectionSort;

public class SelectionSort {
	
	public static int[] sort(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			int min =arr[i];
			int index=i;
			for(int j=i;j<arr.length;j++)
			{
				if(min>arr[j])
				{
					min=arr[j];
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=min;
			arr[index]=temp;
		}
		return arr;
	}

}
