package DirectChaining;

import java.util.ArrayList;
import java.util.LinkedList;
public class DirectChainingOperations {

	LinkedList<String>[] hashTable;
	int maxChainSize=5;
	
	DirectChainingOperations(int size)
	{
		hashTable=new LinkedList[size];
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
	public void insertHashTable(String word)
	{
		int newIndex=modASCIIHashFunction(word,hashTable.length);
		if(hashTable[newIndex]==null) {
			hashTable[newIndex]=new LinkedList<String>();
			hashTable[newIndex].add(word);
		}
		else
		{
			hashTable[newIndex].add(word);
		}
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
	
	public boolean search(String word,int M)
	{
		int newIndex=modASCIIHashFunction(word, M);
		if(hashTable[newIndex].contains(word))
		{
			System.out.println("Index "+newIndex+" contains word: "+word);
			return true;
		}
		else
		{
			System.out.println("Index "+newIndex+" does not contains word: "+word);
			return false;
		}
	}
	
	public void delete(String word ,int M)
	{
		if(search(word, M))
		{
			int newIndex=modASCIIHashFunction(word, M);
			hashTable[newIndex].remove(word);
		}
		
	}
}
