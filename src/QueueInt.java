
public class QueueInt {
	
	private Node head;
	private Node tail;
	
	/**
	 * Konstruktor bez parametara
	 * @param value
	 */
	
	public QueueInt()
	{
		this.head = head;
		this.tail = tail;
	}
	
	/**
	 * Metoda koja dodaje novi element
	 * @param value
	 */
	
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
	
	/**
	 * Metoda koja uklanja prvi element i ispisuje njegovu vrijednost
	 * @return value
	 */
	
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
	
	/**
	 * Metoda koja ispisuje vrijednost prvog elementa
	 * @return value
	 */
	
	public int peek()
	{
		if (head == null)
		{
			throw new NullPointerException("Queue is empty");
		}
		return head.value;
	}
	
	/**
	 * Node klasa
	 * @author gordansajevic
	 *
	 */
	
	private class Node
	{
		private int value;
		private Node next;
		
		/**
		 * Konstruktor sa jednim parametrom
		 * @param value
		 */
		
		public Node(int value)
		{
			this.value = value;
			this.next = null;
		}
		
		/**
		 * Konstruktor sa dva parametra
		 * @param value
		 * @param next
		 */
		
		public Node(int value, Node next)
		{
			this.value = value;
			this.next = next;
		}
	}

}
