
public class QueueInt {
	
	private Node head;
	private Node tail;
	
	public QueueInt()
	{
		this.head = head;
		this.tail = tail;
	}
	
	public void push(int value)
	{
		Node newNode = new Node(value);
		if (head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
			tail.next = null;
		}
	}
	
	public int pop()
	{
		if (head == null)
		{
			throw new NullPointerException("Queue is empty");
		}
		if (head == tail)
		{
			tail = null;
		}
		int value = head.value;
		head = head.next;
		return value;
	}
	
	public int peek()
	{
		if (head == null)
		{
			throw new NullPointerException("Queue is empty");
		}
		return head.value;
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
