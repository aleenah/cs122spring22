package assignments.assignment6;

import java.util.*;

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
		if (!isFull()) {
			newnode.next = top;
			top = newnode;
		}
	}
	
	// ---------------------------------------------------
	// Removes and returns value at top of stack.  If stack
	// is empty returns null.
	// ---------------------------------------------------
	public Object pop() {
		if (isEmpty()) {
			return null;
		} else {
			Object temp = top.getElement();
			top = top.getNext();
			return temp;
		}
	}
	
	// ---------------------------------------------------
	// Returns true if stack is empty, false otherwise.
	// ---------------------------------------------------
	public boolean isEmpty(){ 
		return top == null;
	}

	public boolean isFull() {
		return false;
	}

	public void printStack() {
		Node i = top;
		while (i != null) {
			System.out.println(i.getElement());
			i = i.getNext();
		}
	}
	
	public LinkedStack removeElement(Object val) {
		LinkedStack removedStack = new LinkedStack();
		return removedStack;
	}
	
	public LinkedStack reverseStack() {
		LinkedStack reversed = new LinkedStack();
		for (Node n = top; n != null; n = n.next ) {
			reversed.push(n.getElement());
		} return reversed;
	}
}
