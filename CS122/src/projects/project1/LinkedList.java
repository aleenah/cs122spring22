package projects.project1;

public class LinkedList {
	private IntNode front;
	
	public LinkedList() {
		front = null;
	}

	public void addToEnd(int val) {
		IntNode newnode = new IntNode(val, null);
		if (front == null) {
			front = newnode;
		} else {
			IntNode temp = front;
			while (temp.next != null)
				temp = temp.next;
			temp.next = newnode;
		}
	}
	
	public void removeFirst() {
		if (front != null)
			front = front.next;
	}

	public void print() {
		System.out.println("--------------------");
		System.out.print("List elements: ");
		IntNode temp = front;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println("\n-----------------------\n");
	}


	private class IntNode {
		public int val; 
		public IntNode next; 

		public IntNode(int val, IntNode next) {
			this.val = val;
			this.next = next;
		} 
	}

	public void clear() {
		 front = null;	
		
	}

	public String toString() {		
		String s = "";
		IntNode current = front;
		
		while(current != null) {
			s += current.val + " -> ";
			current = current.next;
		}

        s+= "null";
		return s;
	}
}
