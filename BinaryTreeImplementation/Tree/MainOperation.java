package Tree;

public class MainOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree pNode = new Tree("Drink");
		Tree cNode1 = new Tree("hot");
		Tree cNode2 = new Tree("Cold");
		pNode.insertChild(cNode1);
		pNode.insertChild(cNode2);
		pNode.printChildOfParentNode();
	}

}
