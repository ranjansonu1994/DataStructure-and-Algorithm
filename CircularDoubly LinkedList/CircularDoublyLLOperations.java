
public class CircularDoublyLLOperations {

	public static NodesCD head;
	public static NodesCD tail;
	public static int size;

	public static NodesCD createNode(int value) {
		head = new NodesCD(null);
		tail = new NodesCD(null);
		NodesCD newNode = new NodesCD(null, value, null);
		head.next = newNode;
		tail.next = newNode;
		newNode.prev = newNode;
		newNode.next = newNode;

		return head;

	}

	public static void insertNode(int nodeValue, int location) {
		NodesCD newNodesCD = new NodesCD(null, nodeValue, null);
		if (head.next == null) {
			createNode(nodeValue);
			return;
		} else if (location == 0) {
			newNodesCD.next = head.next; // newNode changes
			newNodesCD.prev = tail.next; // newNode changes
			head.next.prev = newNodesCD; // previous first node changes
			tail.next.next = newNodesCD; // last node changes
			head.next = newNodesCD; // head node changes

		} else if (location >= CircularDoublyLLOperations.forwardTravese()) {
			newNodesCD.next = head.next;
			newNodesCD.prev = tail.next;
			tail.next.next = newNodesCD;
			head.next.prev = newNodesCD;
			tail.next = newNodesCD;
		} else {
             NodesCD temp=CircularDoublyLLOperations.traverseToNode(location).prev;
			System.out.println("\n"+"Location : "+location+" Value : "+temp.value);
			newNodesCD.prev=temp;
			newNodesCD.next=temp.next;
			temp.next.prev=newNodesCD;
			temp.next=newNodesCD;
		    
		}

	}

	public static NodesCD traverseToNode(int pos)
	{
		NodesCD temp=head.next;
		
		for(int i=0;i<pos;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
	public static int forwardTravese() {
		if(head.next==null)
		{
			System.out.println("Zero Nodes");
			return 0;
		}
		else {
		System.out.println(" ");
		System.out.println("Forward Traverse");
		size = 0;
		NodesCD temp = head.next;
		while (true) {
			System.out.print(temp.value + " ");

			size++;
			if (temp.value == tail.next.value) {
				return size;
			}
			temp = temp.next;
		}
		}
		
	}

	public static int backwardTraverse() {
		if(head.next==null)
		{
			System.out.println("Zero Nodes");
			return 0;
		}else
		{
		System.out.println(" ");
		System.out.println("BackWard Traverse");
		size = 0;
		NodesCD temp = tail.next;
		while (true) {
			System.out.print(temp.value + " ");

			size++;
			if (temp.value == head.next.value) {
				return size;
			}
			temp = temp.prev;
		}
		}
	}
	
	public static boolean searchElement(int value)
	{
		boolean status =false;
		NodesCD temp=head;
		int count=CircularDoublyLLOperations.forwardTravese();
		for(int i=0;i<count;i++)
		{
			if(temp.next.value==value)
			{
				status=true;
				break;
			}
			temp=temp.next;
		}
		return status;
	}
	public static void deleteNodes(int location)
	{
		if(head.next==null)
		{
			System.out.println("Nodes are not available");
			return;
		}
		else if(location==0)
		{
			if(head.next.next.value==head.next.value)
			{
				head.next.next=null;
				head.next.prev=null;
				head.next=null;
				tail.next=null;
			}
			else
			{
				head.next.next.prev=tail.next;
				tail.next.next=head.next.next;
				head.next=head.next.next;
			}
		}
		else if(location>=CircularDoublyLLOperations.forwardTravese())
		{
			head.next.prev=tail.next.prev;
			tail.next.prev.next=head.next;
			tail.next=tail.next.prev;
		}
		else
		{
			NodesCD temp=CircularDoublyLLOperations.traverseToNode(location);
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
		}
	}
	public static void deleteDoublyLinkedList()
	{
		
		NodesCD tempForward=head.next;
		NodesCD tempBackWard=tail.next;
		while(tempForward!=tail.next)
		{
			
			tempForward=tempForward.next;
			tempForward.prev.next=null;
			
		}
		while(tempBackWard!=head.next)
		{
			tempBackWard=tempBackWard.prev;
			tempForward.next.prev=null;
		}
		if(head.next==null && tail.next==null)
		{
			System.out.println("Doubly Linked List Deleted");
			return;
		}
		else
			
		{
			head.next=null;
			tail.next=null;
			System.out.println("Doubly Linked List Deleted");
		}
	}
}
