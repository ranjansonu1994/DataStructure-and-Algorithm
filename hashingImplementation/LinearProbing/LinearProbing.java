package LinearProbing;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class LinearProbing {

	String[] hashTable;
	int usedCellNumber;
	
	public LinearProbing(int size) {
		// TODO Auto-generated constructor stub
		this.hashTable=new String[size];
		usedCellNumber=0;
	}
	public int modASCIIHashFunction(String word,int M)
	{
		char ch[];
		ch=word.toCharArray();
		int i ,sum;
		for(sum=0,i=0;i<word.length();i++)
		{
			sum=sum+ch[i];
		}
		return sum%M;
	}
	
	public double getLoadFactor()
	{
		
	double loadFactor=usedCellNumber*1.0/hashTable.length;
	return loadFactor;
	}
	
	//rehash
	
	public void rehashKeys(String word)
	{
		usedCellNumber=0;
		ArrayList<String> data=new ArrayList<String>();
		for(String s:hashTable)
		{
			if(s!=null)
			{
				data.add(s);
			}
			
			
		}
		data.add(word);
		hashTable=new String[hashTable.length*2];
		for(String s:data)
		{
		  insertInHashTable(s);
		}
	}
	
	public void insertInHashTable(String word)
	{
		double loadFactor=getLoadFactor();
		if(loadFactor>=0.75)
		{
			rehashKeys(word);
		}
		else
		{
			int index=modASCIIHashFunction(word,hashTable.length);
			for(int i=index;i<index+hashTable.length;i++)
			{
				int newIndex=i%hashTable.length;
				if(hashTable[newIndex]==null)
				{
					hashTable[newIndex]=word;
					System.out.println("The "+word+" successfully inserted at location: "+newIndex);
					break;
				}
				{
					System.out.println(newIndex+" is already occupied .Trying next empty cell ");
				}
			}
		}
		usedCellNumber++;
	}
	
	public void displayHashTable()
	{
		if(hashTable==null)
		{
			System.out.println("\n Hashtable does not exist");
		}
		else
		{
			for(int i=0;i<hashTable.length;i++)
			{
				System.out.println("Index "+i+", key:"+ hashTable[i]);
			}
		}
	}
	public boolean search(String word)
	{
		int index=modASCIIHashFunction(word, hashTable.length);
		for(int i=0;i<index+hashTable.length;i++)
		{
			int newIndex=i%hashTable.length;
			if(hashTable[newIndex]!=null && hashTable[newIndex].equals(word))
			{
				System.out.println(word+" found at location: "+	newIndex);
				return true;
			}
		}
		System.out.println(word+" not found ");
		return false;
	}
	public void delete(String word)
	{
		int index=modASCIIHashFunction(word,hashTable.length);
		for(int i=index;i<index+hashTable.length;i++)
		{
			int newIndex=i%hashTable.length;
			if(hashTable[index]!=null && hashTable[newIndex].equals(word)) {
				hashTable[newIndex]=null;
				System.out.println(word+" has been deleted from HashTable");
				return;
			}
		}
		System.out.println(word+" not found in HashTable");
	}
}
