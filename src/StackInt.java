
public class StackInt {
	
	private Node head;
	
	/**
	 * Konstruktor bez parametara
	 */
	
	public StackInt()
	{
		this.head = null;
	}
	
	/**
	 * Metoda koja dodaje novi element
	 * @param value
	 */
	
	public void push(int value)
	{
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
	/**
	 * Metoda koja uklanja posljednji element i ispisuje njegovu vrijednost
	 * @return value
	 */
	
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
	
	/**
	 * Metoda koja ispisuje vrijednost posljednjeg elementa
	 * @return value
	 */ 
	
	public int peek()
	{
		if (head == null)
		{
			throw new NullPointerException("Stack is empty!");
		}
		return head.value;
		
	}
	/**
	 * Metoda koja vraća dužinu liste
	 * @return int
	 */
	
	public int getSize()
	{
		if (head == null)
		{
			return 0;
		}
		return getSize(head, 1);
	}
	
	/**
	 * Metoda koja rekurzivno računa dužinu liste
	 * @param current
	 * @param counter
	 * @return int
	 */
	
	private int getSize(Node current, int counter)
	{
		if (current == null)
		{
			return counter;
		}
		return getSize(current.next, counter+1);
	}
	
	/**
	 * Metoda koja vraća boolean vrijednost u zavisnosti da li imamo u listi element sa vrijednošću value
	 * @param value
	 * @return boolean
	 */
	
	public boolean contains(int value)
	{
		return contains(head, value);
	}
	
	/**
	 * Metoda koja rekurzivno provjerava da li imamo u listi element sa vrijednošću value
	 * @param current
	 * @param value
	 * @return boolean
	 */
	
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
