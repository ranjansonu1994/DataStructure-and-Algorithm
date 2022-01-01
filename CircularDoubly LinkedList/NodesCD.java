
public class NodesCD {

	public NodesCD next;
	public NodesCD prev;
	public int value;

	public NodesCD(NodesCD next, int value, NodesCD prev) {
		this.next = next;
		this.prev = prev;
		this.value = value;

	}

	public NodesCD(NodesCD next) {
		this.next = next;
	}

}
