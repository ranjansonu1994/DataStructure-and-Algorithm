package DirectChaining;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DirectChainingOperations dc=new DirectChainingOperations(13);
		dc.insertHashTable("The");
		dc.insertHashTable("quick");
		dc.insertHashTable("brown");
		dc.insertHashTable("fox");
		dc.insertHashTable("over");
		dc.displayHashTable();
		dc.search("fox", 13);
		dc.delete("The", 13);
		dc.displayHashTable();
	}

}
