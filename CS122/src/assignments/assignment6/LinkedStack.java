package assignments.assignment6;

import assignments.assignment5.Node;

public class LinkedStack implements StackADT {
	private Node top; // reference to top of stack
	
	// ---------------------------------------------------
	// Constructor -- initializes top
	// ---------------------------------------------------
	public LinkedStack() {
		top = null;
	}
	
	// ---------------------------------------------------
	// Adds element to top of stack if it's not full, else
	// does nothing.
	// ---------------------------------------------------
	public void push(Object val) {
		Node newnode = new Node(val);

		if (isFull() != false) {
			top = newnode;
		}
	}
	
	// ---------------------------------------------------
	// Removes and returns value at top of stack.  If stack
	// is empty returns null.
	// ---------------------------------------------------
	public Object pop() {
		Object temp = top.getElement();
		if (top.getNext() != null) {
			top = top.getNext();
		} return temp;
	}
	
	// ---------------------------------------------------
	// Returns true if stack is empty, false otherwise.
	// ---------------------------------------------------
	public boolean isEmpty(){ 
		if (top.getElement() == null) {
			return true;
		} else { 
			return false;
		}
		
	}

	public boolean isFull() {
		return false;
	}
	
	
}
