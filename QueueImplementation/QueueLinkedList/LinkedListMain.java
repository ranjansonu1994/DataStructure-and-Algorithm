package QueueLinkedList;

import java.util.Queue;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListOperations ll = new LinkedListOperations();
		System.out.println(ll.createLinkedList(10).data);
		ll.insertData(20, 0);
		ll.insertData(30, 0);
		ll.insertData(40, 0);
		
		ll.insertData(50, ll.size);
		ll.insertData(60, ll.size+1);
		ll.traversal();
		ll.deleteNode(0);
		ll.traversal();
		ll.deleteNode(0);
		ll.traversal();
		ll.searchNode(20);
		LinkedListOperations q=new LinkedListOperations();
		q.enQueue(5);
		q.enQueue(15);
		q.enQueue(25);
		q.traversal();
		q.deQueue();
		q.traversal();
	}

}
