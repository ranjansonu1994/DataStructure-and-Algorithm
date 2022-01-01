package BinaryTreeArray;

import java.util.Arrays;

public class BinaryTreeOperation {

	int topOfBinaryTree;
	String[] binaryArray;

	public BinaryTreeOperation(int size) {
		this.topOfBinaryTree = 0;
		this.binaryArray = new String[size + 1];
	}

	public void insert(String value) {
		if (topOfBinaryTree >= this.binaryArray.length - 1) {
			System.out.println("Binary tree is full");
			return;

		}
		this.binaryArray[topOfBinaryTree + 1] = value;
		this.topOfBinaryTree++;
		System.out.println(Arrays.toString(binaryArray));

	}

	public void preOrderTraversal(int index) {
		if (this.binaryArray[1] == null || index > this.topOfBinaryTree) {
			// System.out.println("Binary tree does not exist!!");
			return;
		}
		System.out.print(this.binaryArray[index] + " ");
		preOrderTraversal(2 * index);
		preOrderTraversal(2 * index + 1);

	}

	public void inOrderTraversal(int index) {
		if (this.binaryArray[1] == null || index > this.topOfBinaryTree) {
			// System.out.println("Binary tree does not exist!!");
			return;
		}

		inOrderTraversal(2 * index);
		System.out.print(this.binaryArray[index] + " ");
		inOrderTraversal(2 * index + 1);

	}

	public void postOrderTraversal(int index) {
		if (this.binaryArray[1] == null || index > this.topOfBinaryTree) {
			// System.out.println("Binary tree does not exist!!");
			return;
		}

		postOrderTraversal(2 * index);
		postOrderTraversal(2 * index + 1);
		System.out.print(this.binaryArray[index] + " ");

	}
	public void deleteNode(String value)
	{
		for(int i=1;i<this.topOfBinaryTree+1;i++)
		{
			if(this.binaryArray[i]==value)
			{
				this.binaryArray[i]=this.binaryArray[this.topOfBinaryTree];
				this.binaryArray[this.topOfBinaryTree]=null;
				this.topOfBinaryTree--;
			}
		}
	}
	public void levelOrderTraversal()
	{
		System.out.println();
		for(int i=1;i<this.topOfBinaryTree+1;i++)
		{
			System.out.print(this.binaryArray[i]+" ");
		}
	}

	public void deleteBinaryTree()
	{
		this.binaryArray=null;
		System.out.println("Binary tree is got deleted!!");
	}
	public boolean searchNode(String value)
	{
		for(int i=1;i<this.topOfBinaryTree+1;i++)
		{
			if(this.binaryArray[i]==value)
			{
				System.out.println(value +" is available at location "+i);
				return true;
			}
			
		}
		System.out.println(value+" Not available");
		return false;
	}
}
