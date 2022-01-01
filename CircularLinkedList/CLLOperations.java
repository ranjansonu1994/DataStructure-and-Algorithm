
public class CLLOperations {

	public static CLLNode head;
	public static CLLNode tail;

	// create node
	public CLLNode createCLLNode(int value) {

		if (head == null) {
			head = new CLLNode(null);
			tail = new CLLNode(null);
			CLLNode firstNode = new CLLNode(null, value);
			head.node = firstNode;
			tail.node = firstNode;
			firstNode.node = firstNode;

		}

		return head;
	}

	// insert node
	// Case 1: At the begining
	// Case 2: At specific location
	// Casr 3: At Last Location
	public void insertNodeCLL(int nodeValue, int location) {
		CLLNode newNode = new CLLNode(null, nodeValue);

		if (location == 0) {
			newNode.node = head.node;
			head.node = newNode;

		}
		if (location > new CLLOperations().traverse() - 1) {
			newNode.node = head.node;
			tail.node.node = newNode;
			tail.node = newNode;

		} else if (location > 0 && location < new CLLOperations().traverse() - 1) {
			CLLNode traverseNode = traverse(location);
			newNode.node = traverseNode.node.node;
			traverseNode.node = newNode;
		}
	}

	public int traverse() {
		CLLNode temp = head;
		boolean status = true;
		int count = 0;
		if (head.node == null) {
			System.out.println("CLL not Exist!!");
			return 0;
		} else {

			while (status) {
				if (temp != tail.node) {
					System.out.print(temp.node.value + " ");

					temp = temp.node;
					count++;
				} else {
					status = false;
				}

			}
			System.out.println("");
		}
		return count;

	}

	public CLLNode traverse(int pos) {
		CLLNode temp = head;
		boolean status = true;
		int count = 0;
		for (int i = 0; i < pos; i++) {

			temp = temp.node;
		}
		return temp;
	}

	public boolean searchInCLL(int value) {

		CLLNode temp = head;
		int count = new CLLOperations().traverse();
		for (int i = 0; i < count; i++) {
			if (temp.node.value == value) {
				return true;
			} else {
				temp = temp.node;
			}
		}
		return false;
	}

	// delete Method
	// Case 1: from begining
	// Case 2: from last
	// Case 3: from middle
	public void deleteInCLL(int location) {
		if (head == null) {
			System.out.println("CLL does not exist!!");
		} else {
			if (location == 0) {
				if (head.node.value == head.node.node.value) {
					head.node.node = null;
					head.node = null;
					tail.node = null;

				} else {

					head.node = head.node.node;
					tail.node.node = head.node;
				}
			} else if (location >= new CLLOperations().traverse()) {
				CLLNode temp = new CLLOperations().traverse(new CLLOperations().traverse() - 1);
				System.out.println(temp.value);
				temp.node.node = null;
				tail.node = temp;
				temp.node = head.node;
				
			}
			else if(location>0 && location<new CLLOperations().traverse())
			{
				CLLNode temp=new CLLOperations().traverse(location);
				
				temp.node=temp.node.node;
				temp.node.node=null;
				
				
			}
		}
	}
}
