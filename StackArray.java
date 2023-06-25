
/*Question
 * 
 * 
 * Implement a stack using an array in Java. 
 * Include the necessary methods such as push, pop, and isEmpty.
 * 
 * 
 * @gouthami.504@gmail.com
 * 
 * 
 */

package in.ineuron.ai;

public class StackArray
{
	private int maxSize;
	private int top;
	private int[] stackArray;
	
	//constructor
	
	public StackArray(int size)
	{
		maxSize = size;
		top = -1;
		stackArray = new int[maxSize];
	}
	
	//Push operation
	public void push(int value)
	{
		if(top == maxSize - 1) {
			System.out.println("Stack is full ..Cannot push element ::");
			return;
		}
		stackArray[++top] = value;
		System.out.println("Pushed element :: " +value);
	}
	
	//pop operation 
	public int pop()
	{
		if (top == -1)
		{
			System.out.println("Stack is empty  :: Cannot  pop element ::");
			return -1;
		}
		int poppedValue = stackArray[top--];
		System.out.println("Popped element :: " +poppedValue);
		return poppedValue;
	}
	
	//check if the stack is empty
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	//Get the top element of the stack without removing it
	public int peek()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		return stackArray[top];
	}
	
	//Get the size of the stack
	public int size()
	{
		return top+1;
	}

	public static void main(String[] args) {
	       
		StackArray stack = new StackArray(5);
		System.out.println("Is stack empty ??"  +stack.isEmpty());
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("Is stack empty ?? "  +stack.isEmpty());
		System.out.println("Stack Size        "  +stack.size());
		System.out.println("Top element       "  +stack.peek());
		
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println("Is stack empty ?? "  +stack.isEmpty());
		

	}

}
