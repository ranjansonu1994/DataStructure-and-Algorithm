package QueueLinkedList;

public class LinkedListOperations {

	Node head;
	Node tail;
	int size = 0;

	public Node createLinkedList(int data) {
		Node newNode = new Node();
		newNode.data = data;
		this.head = newNode;
		newNode.next = null;
		this.tail = newNode;
		this.size = 1;
		return head;
	}

	public void insertData(int data, int location) {
		Node newNode = new Node();
		newNode.data = data;
		if (head == null) {
			this.createLinkedList(data);
		} else {
			if (location == 0) {
				newNode.next = head;
				head = newNode;
			} else if (location >= size) {
				newNode.next = null;
				tail.next = newNode;
				tail = newNode;
			} else {
				Node temp = this.traversal(location);
				newNode.next = temp.next;
				temp.next = newNode;

			}
			this.size++;
		}

	}

	public Node traversal(int pos) {
		Node temp = this.head;
		int i = 1;
		while (i < pos) {

			temp = temp.next;
			i++;
		}
		return temp;
	}

	public int traversal() {
		Node temp = this.head;
		int count = 0;
		System.out.println("\n");
		while (temp != null) {

			System.out.print(temp.data);
			if (temp.next != null) {
				System.out.print("-->");
			}
			temp = temp.next;
		}
		System.out.println("\n");
		return count;
	}

	public void deleteNode(int location) {
		if (head == null) {
			System.out.println("Linked List not exist");
		} else if (location == 0) {
			head = head.next;
		} else if (location >= this.size) {
			Node temp = head;
			for (int i = 0; i < this.size - 3; i++) {
				temp = temp.next;
			}
			tail = temp;
			temp.next = null;
		} else {
			Node temp = this.traversal(location);
			temp.next = temp.next.next;

		}
	}

	public boolean searchNode(int value) {
		boolean status = false;
		Node temp = head;
		int index = 0;
		while (temp.data != value) {

			temp = temp.next;
			index++;
		}
		if (temp.data == value) {
			System.out.println(temp.data + " pos " + index);
			status = true;
		}

		return status;
	}

	public Node enQueue(int value) {
		Node newNode = new Node();
		newNode.data=value;
		if (head == null) {
			this.createLinkedList(value);
		} else {
			newNode.next = null;
			tail.next = newNode;
			tail = newNode;
			this.size++;
		}

		return head;
	}
	public void deQueue()
	{
		if(head==null)
		{
			System.out.println("Queue is empty!!");
		}
		else
		{
			System.out.println(head.data+" is got deleted from queue");
			head=head.next;
			
		}
	}
	public boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		return false;
	}
	public int peek()
	{
		return head.data;
	}
	public void deleteQueue()
	{
		head=null;
		tail=null;
	}
}
