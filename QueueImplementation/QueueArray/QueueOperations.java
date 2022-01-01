package QueueArray;

import java.util.Arrays;

public class QueueOperations {

	private int topOfQueue;
	private int beginningOfQueue;
	private int[] arr;
	public QueueOperations(int size)
	{
		this.arr=new int[size];
		this.topOfQueue=-1;
		this.beginningOfQueue=-1;
	}
	public void enQueue(int value)
	{
		if(!isFull())
		{
			 this.topOfQueue++;
			 if(this.topOfQueue==0)
			 {
				 this.beginningOfQueue=0;
			 }
		 this.arr[this.topOfQueue]=value;	
		 System.out.println(Arrays.toString(arr));
		
		}
		
	}
	public int deQueue()
	{
		int result = 0;
		if(this.beginningOfQueue!=-1 ||this.beginningOfQueue!=arr.length-1)
		{
			result=this.arr[this.beginningOfQueue];
			System.out.println("Deleted Value : "+result);
			this.arr[this.beginningOfQueue]=0;
			this.beginningOfQueue++;
			System.out.println(Arrays.toString(arr));
		}
		if(this.beginningOfQueue==this.arr.length)
		{
			this.beginningOfQueue=0;
			this.topOfQueue=-1;
		}
		return result;
		
	}
	public boolean isFull()
	{
		if(this.topOfQueue==this.arr.length-1)
		{
			System.out.println("Queue is full!!");
			return true;
		}
		return false;
	}
	public boolean isEmpty()
	{
		if(this.topOfQueue<this.arr.length-1)
		{
			System.out.println("Queue is empty");
			return true;
		}
		return false;
	}
	public int getTopOfQueue()
	{
		return this.topOfQueue;
	}
	public int getBigningOfQueue()
	{
		return this.beginningOfQueue;
	}
	
	public int peekQueue()
	{
		return this.arr[this.beginningOfQueue];
	}
	
	
}
