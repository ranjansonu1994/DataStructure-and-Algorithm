package Tree;

import java.util.ArrayList;

public class Tree {
 String data;
 ArrayList<Tree> Nodes;
 
public Tree(String data)
{
	this.data=data;
	this.Nodes=new ArrayList<Tree>();
}
public void insertChild(Tree nodes)
{
	this.Nodes.add(nodes);
}
public void printChildOfParentNode()
{
	System.out.println(this.data);
	for(Tree bto:this.Nodes)
	{
		System.out.println(bto.data);
	}
}
}
