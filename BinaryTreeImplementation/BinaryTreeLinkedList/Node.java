package BinaryTreeLinkedList;

public class Node {

	public Node left;
	public Node right;
	public String data;
	public int height;
	
	public Node(String data, Node left,Node right)
	{
		this.data=data;
		this.left=left;
		this.right=right;
	}
}
