package Stack_LinkedList;
import java.util.Scanner;

public class SingleLnkedListCreation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Node head=null;
		Node tail=null;
		int count=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			if(head==null)
			{
			//head=new SingleLinkedOperations().addNodeLast(head, i);
			}
			else
			{
		//		tail=new SingleLinkedOperations().addNodeLast(head, i);
			}
		}
		new SingleLinkedOperations().addNewNodeBetweenLinkedList(4, head, 100);
		new SingleLinkedOperations().addNewNodeBetweenLinkedList(4, head, 1001);
		new SingleLinkedOperations().traverseLinkedList(head);
		System.out.println(new SingleLinkedOperations().nodeCount(head));
	//	System.out.println("POS 4 Value : "+new SingleLinkedOperations().linkedListNodeValue(count, head));
		head=new SingleLinkedOperations().deleteNode(0, head);
		new SingleLinkedOperations().traverseLinkedList(head);
		System.out.println(new SingleLinkedOperations().nodeCount(head));
		head=new SingleLinkedOperations().deleteNode(6, head);
		new SingleLinkedOperations().traverseLinkedList(head);
		
		
	}

}
