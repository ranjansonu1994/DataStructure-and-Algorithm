
public class TrieOperations {
	
	private TrieNode root;

	//Method 1 :Creation of Trie
	
	public  TrieOperations() {
		// TODO Auto-generated constructor stub
		root=new TrieNode();
		System.out.println("The trie has been created");
	}
	
	//Method 2 : Insert string in trie
	
	/*
	 Four cases in insertion:
	 1. A trie is Blank
	    --> For this we are inserting node one by one in new node and make link to each node and making each node endOfString to No
	        till the last node.
	 
	 2. New String prefix is common to another string prefix
	 3. New String prefix  is already  present  as complete string
	 4. New String to be inserted  is already  presented in trie
	   
	  T.C : O(M) and S.C : O(M)
	 */
	
	public void insert(String str)
	{
		TrieNode current=root;
		for(int i=0;i<str.length();i++)
		{
			 Character ch=str.charAt(i);
			 TrieNode  node=current.children.get(ch);
			 if(node==null)
			 {
				 node=new TrieNode();
				 current.children.put(ch,node);	 
			 }
			 current=node;
		}
		current.endOfString=true;
		System.out.println("successfully inserted "+str+" in trie");
	}
	
	//Method 2 : Searching string in a Trie
	
	/*
	 Here also have three cases 
	 1. String does not exist  in trie
	 2. String Exist in the trie
	 3. String is the prefix of another string , but not exist in the trie
	 */
	
	public boolean search(String str)
	{
		TrieNode current=root;
		for(int i=0;i<str.length();i++)
		{
			Character ch=str.charAt(i);
			TrieNode node =current.children.get(ch);
			if(node==null)
			{
				System.out.println("String "+ str+" doesnot exist in Trie");
				return false;
			}
			
			current=node;
			
		}
		if(current.endOfString==true) {
		return true;
		}
		else
		{
			return false;
		}
	}

	/*
	 Delete  a String  From Trie
	 Case 1: Some other prefix  of  string is same  as the one  that we want to delete
	 Case 2: The String is a prefix  of another  string
	 Case 3: Other string is a prefix  of this string
	 Case 4: Not any node depends upon on this string(K)
	 
	 Note: Creating two methods.
	 */
	public boolean delete(TrieNode node,String str,int index)
	{
		Character ch=str.charAt(index);
		 TrieNode current=node.children.get(ch);
		boolean canThisNodeBeDeleted;
		if(current.children.size()>=1)
		{
			delete(current, str, index+1);
			return false;
		}
		if(index==str.length()-1)
		{
				if(current.children.size()>=1)
				{
					current.endOfString=false;
					return false;
				}
				else
				{
					node.children.remove(ch);
					return true;
				}
		}
		if(node.endOfString==true)
		{
			
			delete(current, str, index+1);
			return false;
		}
		canThisNodeBeDeleted=delete(current, str, index+1);
		if(canThisNodeBeDeleted==true)
		{
			node.children.remove(ch);
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public void deleteString(String str)
	{
		if(search(str)==true)
		{
			delete(root, str, 0);
		}
	}
}
