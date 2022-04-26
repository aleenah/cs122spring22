package assignments.assignment5;
import java.util.LinkedList;

public class IntList {
	private IntNode front;
	
	public IntList() {
		front = null;
	}
	
	public void addToFront(int val) {
		front = new IntNode(val, front);
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
		if (front != null) {
			front = front.next;
		}
	}
	
	public void print() {
		System.out.println("----------------------");
		System.out.print("List elements: ");
		
		IntNode temp = front; 
		
		while (temp!= null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.println("\nList length: " + length());
		System.out.println("\n----------------------\n");
	}
	
	public int length() {
		int count = 0;
        for (IntNode n = front; n.next != null; n = n.next ) {
        	count ++;
        }
        return count + 1; 
	}
	
	public void removeLast() {
		if (front != null) {
			IntNode lastNode = front;
			IntNode prev2last = null; 
			while (lastNode.next != null) {
				prev2last = lastNode; 
				lastNode = lastNode.next;
			}
			prev2last.next = null; 
			print();
		}
	} 
	
	public void replace(int oldInt, int newInt) {
		for (IntNode n = front; n.next != null; n = n.next ) {
			if (n.equals(oldInt)) {
				System.out.print("test");
			}
		}
	}
	
	
	private class IntNode {
		public int val;
		public IntNode next;
	
	public IntNode(int val, IntNode next) {
		this.val = val; 
		this.next = next;
		}
	}
	
	
}
