
public class DoublyLLOperations {
	
	public static Nodes head;
	public static Nodes tail;
	public static int size;
	//Time Complexity : O(1)
	//Space Complexity : O(1)
	public static Nodes createNode(int value)
	{
		head=new Nodes(null);
		tail=new Nodes(null);
		Nodes newNode=new Nodes(value, null, null);
		head.next=newNode;
		tail.next=newNode;
		return head;
	}
	public static Nodes insertNode(int value,int location)
	{
		Nodes newNode=new Nodes(value, null, null);
		if(head==null)
		{
			head=createNode(value);
			return head;
		}
		else
		{
			if(location==0)
			{
				if(head.next.next==null)
				{
					newNode.next=head.next;
					head.next.prev=newNode;
					head.next=newNode;
					
				}
				else
				{
					newNode.next=head.next;
					head.next.prev=newNode;
					head.next=newNode;
				}
			}
			else if(location>=size)
			{
				Nodes temp=DoublyLLOperations.traverse();
				temp.next=newNode;
				newNode.prev=temp;
				tail.next=newNode;
			}
			else
			{
				Nodes temp=DoublyLLOperations.TravereseToPos(location);
				System.out.println(temp.value);
				temp.next.prev=newNode;
				newNode.prev=temp;
				newNode.next=temp.next;
				temp.next=newNode;
				
			}
		}
		return null;
	}
	public static void deleteNodes(int location)
	{
		DoublyLLOperations.traverse();
		if(head==null)
		{
			
		}
		else
		{
			if(location==0)
			{
				if(head.next.next==null)
				{
					head.next=null;
					tail.next=null;
					
				}
				else
				{
					head.next.next.prev=null;
					head.next=head.next.next;
					
				}
			}
			else if(location>=size)
			{
				tail.next.prev.next=null;
				tail.next=tail.next.prev;
			}
			else
			{
				Nodes temp=DoublyLLOperations.TravereseToPos(location);
				temp.next.next.prev=temp;
				temp.next=temp.next.next;
			}
				
		}
	}
	public static Nodes traverse()
	{
		System.out.println("\n"+"Forward Traverse");
		size=0;
		Nodes temp=head.next;
		while(true)
		{
			System.out.print(temp.value+" ");
			Nodes prevTemp=temp;
			temp=temp.next;
			size++;
			if(temp==null)
			{
				System.out.println("");
				return prevTemp;
				
			}
			
		}
		
		
	}
	public static Nodes reverseTraverse()
	{
		System.out.println("\n"+"Reverse Traverse");
		Nodes temp =tail.next;
		while(true)
		{
			Nodes prevTemp=temp;
			System.out.print(prevTemp.value+" ");
			
			temp=temp.prev;
			
			if(temp==null)
			{
				System.out.println("");
				return prevTemp;
				
			}
		}
	}
	
	public static Nodes TravereseToPos(int pos)
	{
		
		Nodes temp=head;
		Nodes prevTemp=null;
		for(int i=0;i<pos;i++)
		{
			prevTemp=temp;
			temp=temp.next;
			
		}
		return prevTemp;
		
	}
	
	public static boolean searchElement(int value)
	{
		boolean status=false;
		DoublyLLOperations.traverse();
		Nodes temp=head;
		for(int i=0;i<size;i++)
		{
			if(temp.next.value==value)
			{
				return true;
			}
			temp=temp.next;
		}
		return status; 
	}
	
  
}
