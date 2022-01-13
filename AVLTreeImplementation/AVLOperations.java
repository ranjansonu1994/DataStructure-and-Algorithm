import BinaryTreeLinkedList.Node;

public class AVLOperations {
	NodeAVL root;

	int height(NodeAVL N) {
		if (N == null)
			return 0;

		return N.height;
	}

	int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public NodeAVL insertBSTNode(NodeAVL node, int key) {

		NodeAVL newNode;
		if (node == null) {
			return (new NodeAVL(key));

		}

		// System.out.println("Node : "+node.key+" KEY :"+key);
		if (node.key > key) {
			node.left = insertBSTNode(node.left, key);
			/// System.out.println(node.key);

		} else if (node.key < key) {
			node.right = insertBSTNode(node.right, key);
			// System.out.println(node.key);
		} else if (node.key == key) {
			return node;
		}
		node.height = 1 + max(height(node.left), height(node.right));
		return node;
	}

	public void inOrderTraversal(NodeAVL node) {
		if (node == null) {
			return;
		}

		inOrderTraversal(node.left);
		System.out.print(node.key + " ");
		inOrderTraversal(node.right);
	}

}
