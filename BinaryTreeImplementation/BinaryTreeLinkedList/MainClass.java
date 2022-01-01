package BinaryTreeLinkedList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeOperation btree = new BinaryTreeOperation();

		btree.insertNode("N1");
		btree.insertNode("N2");
		btree.insertNode("N3");
		btree.insertNode("N4");
		btree.insertNode("N5");
		btree.insertNode("N6");
		btree.insertNode("N7");
		btree.insertNode("N8");
		btree.insertNode("N9");
		btree.delete("N4");
		btree.levelOrderTraversal();
		btree.deleteBinaryTree();
	}

}
