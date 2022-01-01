import java.util.Scanner;

public class CalculateAverageTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many day's temperature? ");
		int arrayCount=sc.nextInt();
		int[] arr=new int[arrayCount];
		double average=0;
		for(int i=0;i<arrayCount;i++) {
			System.out.println("Day's "+i+"'s high temp:");
			arr[i]=sc.nextInt();
			average=average+arr[i];
		}
		average=average/arrayCount;
		System.out.println("Average = "+average);
		int count=0;
		for(int i=0;i<arrayCount;i++)
		{	
			if(arr[i]>average)
			{
				count++;
			}
		}
		System.out.println(count+" day(s) above average");
		
   
	}

}
