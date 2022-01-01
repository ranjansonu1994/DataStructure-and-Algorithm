package TwoDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Creating2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
	}

}
