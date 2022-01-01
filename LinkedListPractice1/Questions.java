
public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll=new LinkedList();
		LinkedList ll1=new LinkedList();
		
		//System.out.println(ll.head.value);
		ll.insertNode(6, 0);
		ll.insertNode(1, 0);
		
		ll.insertNode(7, 0);
		
		ll1.insertNode(2, 0);
		ll1.insertNode(9, 0);
		ll1.insertNode(5, 0);
		
	
		
		
		
		
		ll.traversalLL();
		System.out.println("\n");
		ll1.traversalLL();
		
		Questions dsum=new Questions();
		LinkedList d=dsum.digitSum(ll, ll1);
		d.traversalLL();
		
//		LinkedList part=new Questions().partition(ll, 10);
//		System.out.println("\n");
//		part.traversalLL();
//		ll.traversalLL();
//		System.out.println("\n"+ll.size);
//		System.out.println(ll.deleteDups(ll, 2));
//		ll.traversalLL();
	
		
		
	}
	public  LinkedList partition(LinkedList ll, int x)
	{
		LinkedList partition=new LinkedList();
		NodeP1 temp=ll.head;
		
		for(int i=0;i<ll.size;i++)
		{
			int val=temp.value;
			if(val<x)
			{
				partition.insertNode(val, 0);
			}
			else
			{
				partition.insertNode(val, partition.size);
			}
			temp=temp.next;
			
		}
		return partition;
	}
	
	public LinkedList digitSum(LinkedList ll,LinkedList ll1)
	{
		LinkedList dsum=new LinkedList();
		int carry=0;
		int digitsum=0;
		int indexval;
		for(int i=0;i<ll.size;i++)
		{
			digitsum=carry+ll.getValue(i)+ll1.getValue(i);
			if(digitsum>9)
			{
				indexval=digitsum%10;
				carry=digitsum/10;
			}
			else
			{
				indexval=digitsum;
			}
			dsum.insertNode(indexval, ll.size+1);
		}
		return dsum;
	}

}
