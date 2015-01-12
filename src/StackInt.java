
public class StackInt {
	
	private Node head;
	
	public StackInt()
	{
		this.head = null;
	}
	
	public void push(int value)
	{
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
	public int pop()
	{
		if (head == null)
		{
			throw new NullPointerException("Stack is empty!");
		}
		Node current = head;
		head = head.next;
		int value = current.value;
		current = null;
		return value;
	}
	
	public int peek()
	{
		if (head == null)
		{
			throw new NullPointerException("Stack is empty!");
		}
		return head.value;
		
	}
	
	public int getSize()
	{
		if (head == null)
		{
			return 0;
		}
		return getSize(head, 1);
	}
	
	private int getSize(Node current, int counter)
	{
		if (current == null)
		{
			return counter;
		}
		return getSize(current.next, counter+1);
	}
	
	public boolean contains(int value)
	{
		return contains(head, value);
	}
	
	private boolean contains(Node current, int value)
	{
		
		if (current.value == value)
		{
			return true;
		}
		if (current.next == null)
		{
			return false;
		}
		return contains(current.next, value);
	}
	
	private class Node
	{
		private int value;
		private Node next;
		
		public Node(int value)
		{
			this.value = value;
			this.next = null;
		}
		
		public Node(int value, Node next)
		{
			this.value = value;
			this.next = next;
		}
	}

}
