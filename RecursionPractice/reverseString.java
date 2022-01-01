import java.util.ArrayList;
import java.util.Arrays;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="ranjan kumar sonu what";
    String changed="";
    ArrayList<Integer> indexArray=new ArrayList<Integer>();
    indexArray.add(0);
    new reverseString().revString(str,0,indexArray);
    String[] strArr=str.split("");
    for(int x:indexArray)
    {
    	strArr[x]=strArr[x].toUpperCase();
    	
    }
   for(int i=0;i<strArr.length;i++)
   {
	   changed=changed+strArr[i];
	   
   }
   System.out.println(changed);
    
	}
	public ArrayList<Integer> revString(String str,int length,ArrayList<Integer> indexArray)
	{
		if(length==str.length())
		{
			return indexArray;
		}
		if(str.substring(length, length+1).equals(" "))
		{
			indexArray.add(length+1);
		}
		
		
		return revString(str,length+1,indexArray);
	}

}
