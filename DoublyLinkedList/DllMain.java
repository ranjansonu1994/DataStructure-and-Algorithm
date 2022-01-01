
public class DllMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLLOperations.createNode(5);
		DoublyLLOperations.traverse();
		DoublyLLOperations.reverseTraverse();
		
		DoublyLLOperations.insertNode(10, 0);
		DoublyLLOperations.traverse();
		DoublyLLOperations.reverseTraverse();
		
		DoublyLLOperations.insertNode(15, 5);
		DoublyLLOperations.traverse();
		DoublyLLOperations.reverseTraverse();
		
		DoublyLLOperations.insertNode(20, 3);
		DoublyLLOperations.traverse();
		DoublyLLOperations.reverseTraverse();
		
		DoublyLLOperations.insertNode(25, 2);
		DoublyLLOperations.traverse();
		DoublyLLOperations.reverseTraverse();
		
		
		
		DoublyLLOperations.deleteNodes(4);
		DoublyLLOperations.traverse();
		DoublyLLOperations.reverseTraverse();
		
		DoublyLLOperations.deleteNodes(3);
		DoublyLLOperations.traverse();
		DoublyLLOperations.reverseTraverse();
		
		System.out.println(DoublyLLOperations.searchElement(20));
		System.out.println(DoublyLLOperations.searchElement(25));
		System.out.println(DoublyLLOperations.searchElement(10));
		System.out.println(DoublyLLOperations.searchElement(30));
	}

}
