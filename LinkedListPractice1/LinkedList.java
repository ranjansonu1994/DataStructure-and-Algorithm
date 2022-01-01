import java.util.Iterator;

public class LinkedList {
	public  NodeP1 head;
	public  NodeP1 tail;
	public  int size;

	public void createLL(int nodeValue) {
		NodeP1 newNode = new NodeP1();
		newNode.value = nodeValue;
		newNode.next = null;
		this.head = newNode;
		this.tail = newNode;
		this.size = 1;
	}

	public void insertNode(int nodeValue, int location) {
		
		NodeP1 newNode = new NodeP1();
		newNode.value = nodeValue;
		if (head == null) {
			this.createLL(nodeValue);
			size--;
		} else if (location == 0) {
			newNode.prev = null;
			newNode.next = head;
			this.head.prev = newNode;
			this.head = newNode;
		} else if (location >= size) {
			newNode.next = null;
			newNode.prev = tail;
			this.tail.next = newNode;
			this.tail = newNode;

		} else {
			NodeP1 tempNode = this.traversalToLL(location - 1);
			
			newNode.prev = tempNode;
			newNode.next = tempNode.next;
			tempNode.prev = newNode;
			tempNode.next = newNode;
		}
		this.size++;
	}

//	public void traversalLL() {
//		NodeP1 tempNode = head;
//		System.out.println("\n");
//		for (int i = 0; i < size; i++) {
//			System.out.print(tempNode.value);
//			if (i != (size - 1)) {
//				System.out.print("->");
//			}
//			tempNode = tempNode.next;
//		}
//	}
	
	public void traversalLL() {
	    NodeP1 tempNode = this.head;
	    for (int i =0; i<this.size; i++) {
	      System.out.print(tempNode.value);
	      if (i != this.size -1) {
	        System.out.print(" -> ");
	      }
	      tempNode = tempNode.next;
	    }
	  }

	public void deleteLL(int location) {
		
		if (this.head == null) {
			System.out.println("Linked List not exist");
		} else if (location == 0) {
			this.head.next.prev = null;
			this.head = head.next;
		} else if (location >= this.size-1) {
			this.tail.prev.next = null;
			this.tail = tail.prev;
		} else {
           NodeP1 temp=this.traversalToLL(location);
          
           temp.prev.next=temp.next;
           temp.next.prev=temp.prev;
           
		}
		this.size--;
	}

	public int getValue(int pos)
	{
		NodeP1 tempNode=this.head;
		for (int i = 0; i < pos; i++) {
			//System.out.print(tempNode.value);
			if (i != (pos - 1)) {
				//System.out.print("->");
			}
			tempNode = tempNode.next;
		}
		return tempNode.value;
	}
	public NodeP1 traversalToLL(int pos) {
		NodeP1 tempNode = this.head;
		//System.out.println("\n");
		for (int i = 0; i < pos; i++) {
		//	System.out.print(tempNode.value);
			if (i != (pos - 1)) {
				//System.out.print("->");
			}
			tempNode = tempNode.next;
		}
		return tempNode;
	}
	
	public int deleteDups(LinkedList ll,int pos)
	{
		NodeP1 temp=this.traversalToLL(this.size-pos);
		return temp.value;
	}
	public void deleteDups(LinkedList ll)
	{
		NodeP1 temp=this.head;
		
		int flag=0;
		for(int i=0;i<this.size;)
		{
			for(int j=i+1;j<this.size;j++)
			{
				//System.out.println(i+" : "+ll.getValue(i)+" , "+j+" : "+ll.getValue(j));
				if(this.getValue(i)==this.getValue(j))
				{
					this.deleteLL(j);
					flag=1;
				}
				
			}
			if(flag==1) {
				i=0;
				flag=0;
			}
			else
			{
				i++;
			}
//			
		}
	}
	public NodeP1 findIntersection(LinkedList llA,LinkedList llB)
	{
		NodeP1 temp=llA.head;
		NodeP1 temp1=llB.head;
		if(llA.size>llB.size)
		{
			for(int i=0;i<(llA.size-llB.size)-1;i++)
			{
				temp=temp.next;
			}
		}
		else if(llB.size>llA.size)
		{
			for(int i=0;i<(llA.size-llB.size)-1;i++)
			{
				temp1=temp1.next;
			}
		}
		while(true)
		{
			
			if(temp.next==temp1.next)
			{
				break;
			}
			else
			{
				temp=temp.next;
			}
		}
		return temp;
		
	}
}
