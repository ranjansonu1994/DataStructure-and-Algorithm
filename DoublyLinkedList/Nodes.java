
public class Nodes {

	int value;
	Nodes prev;
	Nodes next;
	
	public Nodes(int value,Nodes prev,Nodes next)
	{
	this.value=value;
	this.prev=prev;
	this.next=next;
	}
	public Nodes(Nodes next)
	{
		this.next=next;
	}
}
