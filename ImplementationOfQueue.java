/*
 * 
 * Question
 * 
 * Implement a queue using a linked list in Java. 
 * Include the necessary methods such as enqueue, dequeue, and isEmpty.
 * 
 * 
 * @gouthami.504@gmail.com
 * 
 */

package in.ineuron.ai;

public class ImplementationOfQueue {
	
	private Node front;
	private Node rear;
	
	private class Node
	{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	
	//constructor
	public void Queue() {
		front = null;
		rear  = null;
	}
	
	//Enqueue operation
	public  void enqueue(int value)
	{
		Node node = new Node(value);
		if(isEmpty())
		{
			front = node;
			rear = node;
		}else {
			rear.next = node;
			rear = node;
		}
		System.out.println("Enqueue element :: " +value);
	}
	
	//Dequeue operation
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty :: Cannot dequeue element ::");
			return -1;
		}
		
		int dequeueValue = front.data;
		front = front.next;
		if(front == null)
		{
			rear = null;
		}
		System.out.println("Dequeued element :: " +dequeueValue);
		return dequeueValue;
	}
	
	//check if the queue is empty
	public boolean isEmpty()
	{
		return (front == null);
	}
	
	public static void main(String[] args) {
	 
	   ImplementationOfQueue queue = new ImplementationOfQueue();
	   System.out.println("Is queue empty ??"  +queue.isEmpty());
	   
	   queue.enqueue(10);
	   queue.enqueue(20);
	   queue.enqueue(30);
	   
	   
	   System.out.println("Is queue empty ??"  +queue.isEmpty());
	   
	   queue.dequeue();
	   queue.dequeue();
	   queue.dequeue();
	   
	   
	   System.out.println("Is queue empty ??"  +queue.isEmpty());
	}

}
