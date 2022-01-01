package QueueArray;

public class queueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueOperations qo = new QueueOperations(8);
		System.out.println(qo.getBigningOfQueue());
		System.out.println(qo.getTopOfQueue());
		for(int i=0;i<8;i++)
		{
		qo.enQueue(10*i+10);
		}
		System.out.println(qo.getBigningOfQueue());
		System.out.println(qo.getTopOfQueue());
		for(int i=0;i<8;i++)
		{
		//
		System.out.println("Peek of queue : "+qo.peekQueue());
		qo.deQueue();
		}
		System.out.println(qo.getBigningOfQueue());
		System.out.println(qo.getTopOfQueue());
		qo.enQueue(90);
		qo.enQueue(100);
		System.out.println(qo.getBigningOfQueue());
		System.out.println(qo.getTopOfQueue());
		qo.deQueue();
		qo.deQueue();
		//qo.deQueue();
		
		
	}

}
