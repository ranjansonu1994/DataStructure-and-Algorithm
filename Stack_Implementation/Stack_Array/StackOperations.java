package Stack_Array;

public class StackOperations {
	
	int topOfStack=-1;
	int[] arr;
	//create stack
	public StackOperations(int size)
	{
		this.arr=new int[size];
		
	}
	//push
	public void push(int value)
	{
		if(this.isFull())
		{
			System.out.println("The stack totally full");
		}
		else
		{
			this.topOfStack++;
			this.arr[topOfStack]=value;
			System.out.println("Value : "+value+" is successfully added "+" at "+this.topOfStack+" position.");
		}
	}
	//pop
	public void pop()
	{
		if(this.isEmpty())
		{
			System.out.println("The stack is empty");
		}
		else
		{
			this.topOfStack--;
			System.out.println("Value : "+this.arr[topOfStack+1]+" is successfully removed from"+" at "+(this.topOfStack+1)+" position.");
		}
	}
	//isFull
	public boolean isFull()
	{
		if(this.topOfStack>=this.arr.length-1)
		{
			return true;
		}
		return false;
	}
	//isEmpty
	public boolean isEmpty()
	{
		if(this.topOfStack==-1)
		{
			return true;
		}
		return false;
	}
	//peek
	public int peek()
	{
		if(this.isEmpty())
		{
			System.out.println("No value stored in stack");
			return -1;
		}
		int value=this.arr[topOfStack];
		System.out.println("Peek Value : "+value);
		return value;
	}
	//deleteStack
	public void deleteStack()
	{
		this.arr=null;
		System.out.println("Stack is successfully deleted");
	}
	

}
