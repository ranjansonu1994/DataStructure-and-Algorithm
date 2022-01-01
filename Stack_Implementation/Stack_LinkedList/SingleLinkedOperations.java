package Stack_LinkedList;

public class SingleLinkedOperations {
	Node head;
	Node tail;
	public Node addNodeLast(int value)
	{
		System.out.println("New Node Value : "+value);
		Node newNode=new Node(value,null);
		Node tail=newNode;
		if(this.head==null)
		{
			
			this.head=newNode;
			return this.head;
		}
		else
		{
			
			
			Node temp=head;
			boolean status=true;
			while(status)
			{
			 if(temp.node==null)
			 {
				 temp.node=newNode;
				 status=false;
			 }
			 
			 temp=temp.node;
			}
				
		}
		return tail;
	}
	public void traverseLinkedList(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			Node current=temp;
			System.out.println(current.value);
			temp=current.node;
		}
	}
	public Node traverseLinkedListToPosition(int pos,Node head)
	{
		Node node=head;
		for(int i=1;i<pos;i++)
		{
			node=node.node;
		}
		return node;
	}
	public int linkedListNodeValue(int pos,Node head)
	{
		Node node=new SingleLinkedOperations().traverseLinkedListToPosition(pos, head);
		return node.value;
	}
	public void addNewNodeBetweenLinkedList(int pos,Node head,int value)
	{
		Node node=new SingleLinkedOperations().traverseLinkedListToPosition(pos,head);
		Node temp=node.node;
		Node newNode=new Node(value,node.node);
		node.node=newNode;
		
	}
	public int nodeCount(Node head)
	{
		int nodeCount=0;
		boolean status=true;
		Node temp=head;
		while(status)
		{
			
			if(temp==null)
			{
				status=false;
			}
			else
			{
			temp=temp.node;
			}
			nodeCount++;
		}
		return nodeCount-1;
	}
	public Node deleteNode(int pos,Node head)
	{
		if(pos==0)
		{
			Node node=head.node;
			head=node;
			return head;
		}
		if(pos>0)
		{
			Node node=new SingleLinkedOperations().traverseLinkedListToPosition(pos, head);
			Node delete=node.node;
			node.node=node.node.node;
			delete.node=null;
			
		}
		return head;
	}

}
