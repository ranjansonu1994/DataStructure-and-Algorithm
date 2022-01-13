package LinearProbing;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinearProbing linearProbing=new LinearProbing(13);
     linearProbing.insertInHashTable("The");
     linearProbing.insertInHashTable("quick");
     linearProbing.insertInHashTable("brown");
     linearProbing.insertInHashTable("fox");
     linearProbing.insertInHashTable("over");
     linearProbing.displayHashTable();
	}

}
