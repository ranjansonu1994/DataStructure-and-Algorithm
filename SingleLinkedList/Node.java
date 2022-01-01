
public class Node {
	
	int value;
	Node node;
	
	public Node(int value,Node node)
	{
		this.value=value;
		this.node=node;
	}
	
	public Node (Node node)
	{
		this.node=node;
	}

}
