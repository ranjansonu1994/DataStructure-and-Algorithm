
public class MainClassTrie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TC: O(1) ans SC: O(1)
     TrieOperations to=new TrieOperations();
    
     to.insert("APIS");
     to.insert("BCD");
     System.out.println(to.search("BCD"));//String does not exist in trie
     System.out.println(to.search("API"));
     to.insert("API");
     System.out.println(to.search("API"));
     
	}

}
