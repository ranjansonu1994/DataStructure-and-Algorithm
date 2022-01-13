
public class MainClassAVL {
	
	static NodeAVL node;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AVLOperations avo=new AVLOperations();
		node=avo.insertBSTNode(node, 80);
		//System.out.println(node.key);
		node=avo.insertBSTNode(node, 60);
		//System.out.println(node.key);
		node=avo.insertBSTNode(node, 90);
		//System.out.println(node.key);
		node=avo.insertBSTNode(node, 40);
		//System.out.println(node.key);
		node=avo.insertBSTNode(node, 10);
		//System.out.println(node.key);
		node=avo.insertBSTNode(node, 30);
		//System.out.println(node.key);
		node=avo.insertBSTNode(node, 100);
		//System.out.println(node.key);
		node=avo.insertBSTNode(node, 45);
		//System.out.println(node.key);
		avo.inOrderTraversal(node);
		
	}

}
