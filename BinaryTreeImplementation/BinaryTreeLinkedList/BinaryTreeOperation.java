package BinaryTreeLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeOperation {

	Node root;

	public BinaryTreeOperation() {
		this.root = null;
	}

	public void inOrderTraversal(Node node) {
		if (node == null) {
			return;
		}

		inOrderTraversal(node.left);
		System.out.print(node.data + " ");
		inOrderTraversal(node.right);
	}

	public void preOrderTraversal(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data + " ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}

	public void postOrderTraversal(Node node) {
		if (node == null) {
			return;
		}

		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print(node.data + " ");
	}

	public void levelOrderTraversal() {
		Queue<Node> q = new LinkedList<Node>();
		q.add(this.root);

		while (!q.isEmpty()) {
			Node presentNode = q.remove();
			System.out.print(presentNode.data + " ");
			if (presentNode.left != null) {
				q.add(presentNode.left);
			}
			if (presentNode.right != null) {
				q.add(presentNode.right);
			}

		}
	}

	public boolean searchNode(String value) {
		if (root == null) {
			System.out.println("The binary tree does not exist!!");
			return false;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(this.root);
		while (!queue.isEmpty()) {
			Node parentNode = queue.remove();
			if (parentNode.data == value) {
				System.out.println("Value " + value + " is present in the existing tree!!");
				return true;
			}
			if (parentNode.left != null)
				queue.add(parentNode.left);
			if (parentNode.right != null)
				queue.add(parentNode.right);
		}
		System.out.println("Value " + value + " is not present in the existing tree!!");
		return false;
	}

	public void insertNode(String value) {
		Node newNode = new Node(value, null, null);
		if (root == null) {
			System.out.println(newNode.data + " is added to root of the tree");
			root = newNode;
			return;
		}

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		Node parentNode;
		while (!queue.isEmpty()) {
			parentNode = queue.remove();
			if (parentNode.left == null) {
				parentNode.left = newNode;
				System.out.println(newNode.data + " is added left to " + parentNode.data);
				return;
			}
			if (parentNode.right == null) {
				parentNode.right = newNode;
				System.out.println(newNode.data + " is added right to " + parentNode.data);
				return;
			}
			if (parentNode.left != null) {
				queue.add(parentNode.left);
			}
			if (parentNode.left != null) {
				queue.add(parentNode.right);
			}

		}
	}

	public Node getDeepestNode() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(this.root);
		Node parentNode = null;

		while (!queue.isEmpty()) {
			parentNode = queue.remove();
			if (parentNode.left != null) {
				queue.add(parentNode.left);

			}
			if (parentNode.right != null) {
				queue.add(parentNode.right);

			}
		}
		return parentNode;
	}

	public void deleteDeepestNode() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(this.root);
		Node parentNode = null;
		Node previousNode = null;
		while (!queue.isEmpty()) {
			previousNode = parentNode;
			parentNode = queue.remove();

			if (parentNode.left == null) {
				System.out.println(previousNode.right.data + " is got deleted");
				previousNode.right = null;

				return;
			}
			if (parentNode.right == null) {
				System.out.println(parentNode.left.data + " is got deleted");
				parentNode.left = null;

				return;
			}

			if (parentNode.left != null) {
				queue.add(parentNode.left);

			}
			if (parentNode.right != null) {
				queue.add(parentNode.right);

			}
		}

	}

	public void delete(String value) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node parentNode = queue.remove();
			if (parentNode.data == value) {
				parentNode.data = getDeepestNode().data;
				deleteDeepestNode();
				return;
			}
			if (parentNode.left != null)
				queue.add(parentNode.left);
			if (parentNode.right != null)
				queue.add(parentNode.right);
		}
	}
	public void deleteBinaryTree()
	{
		this.root=null;
		System.out.println("Binary tree is deleted");
	}

}
