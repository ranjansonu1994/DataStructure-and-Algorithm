
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	CircularDoublyLLOperations.createNode(25);
	CircularDoublyLLOperations.deleteNodes(0);
	CircularDoublyLLOperations.forwardTravese();
	CircularDoublyLLOperations.backwardTraverse();
	CircularDoublyLLOperations.insertNode(35, 0);
	CircularDoublyLLOperations.insertNode(45, 2);
	CircularDoublyLLOperations.forwardTravese();
	CircularDoublyLLOperations.backwardTraverse();
	CircularDoublyLLOperations.insertNode(55, 1);
	CircularDoublyLLOperations.forwardTravese();
	CircularDoublyLLOperations.backwardTraverse();
	CircularDoublyLLOperations.insertNode(65, 2);
	CircularDoublyLLOperations.forwardTravese();
	CircularDoublyLLOperations.backwardTraverse();
	System.out.println(CircularDoublyLLOperations.searchElement(45));
	CircularDoublyLLOperations.deleteNodes(2);
	CircularDoublyLLOperations.forwardTravese();
	CircularDoublyLLOperations.backwardTraverse();
	CircularDoublyLLOperations.deleteDoublyLinkedList();
	
	}

}
