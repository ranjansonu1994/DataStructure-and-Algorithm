/*What is Trie and why it is needed*
 Ans: Tree base data structure , Organize information in hierarchy
 Mainly used for string 
 
 To solve many standard  problems in efficient way
 - Spelling Checker
 - Auto completion
 
 Properties of Trie data structure
 1.search and store string in space and time efficient way
 2.store non repitative multiple character
 3.Every node contain link of next character
 4.Every node keep track of endOfString
 */

/*
 Common operation in Trie:
 
 1. Creation 
 2. Insert
 3. Search
 4. Delete
 */

import java.util.HashMap;

//Creating class named as TrieNode contains 1.character 2.Link to next node 3.Endofstring of boolean type
public class TrieNode {

	HashMap<Character, TrieNode> children; // Hashmap is used because key would be used as character and value as a link to next node 
	boolean endOfString;

	public TrieNode()
	{
		children =new HashMap<Character, TrieNode>();
		endOfString =false;
	}
}
