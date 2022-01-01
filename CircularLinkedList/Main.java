
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CLLOperations cll= new CLLOperations();
		CLLNode head=cll.createCLLNode(10);
		cll.traverse();
		cll.insertNodeCLL(56, 0);
		cll.insertNodeCLL(57, 0);
		cll.insertNodeCLL(58, 0);
		cll.traverse();
		cll.insertNodeCLL(58, 4);
		cll.traverse();
		cll.insertNodeCLL(101, 2);
		cll.insertNodeCLL(500, 0);
		cll.insertNodeCLL(501, 10);
		cll.insertNodeCLL(502, 4);
		cll.traverse();
		System.out.println(cll.searchInCLL(101));
		System.out.println(cll.searchInCLL(104));
		cll.deleteInCLL(0);
		cll.traverse();
		cll.deleteInCLL(6);
		cll.traverse();
		cll.deleteInCLL(3);
		cll.traverse();
		
	}

}
