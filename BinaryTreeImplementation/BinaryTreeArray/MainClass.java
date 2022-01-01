package BinaryTreeArray;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeOperation bta = new BinaryTreeOperation(9);
		bta.insert("N1");
		bta.insert("N2");
		bta.insert("N3");
		bta.insert("N4");
		bta.insert("N5");
		bta.insert("N6");
		bta.insert("N7");
		bta.insert("N8");
		bta.insert("N9");
		bta.insert("N10");
		bta.preOrderTraversal(1);
		System.out.println();
		bta.inOrderTraversal(1);
		System.out.println();
		bta.postOrderTraversal(1);
		bta.deleteNode("N8");
		
		bta.levelOrderTraversal();
		bta.searchNode("N6");
		bta.deleteBinaryTree();

	}

}
