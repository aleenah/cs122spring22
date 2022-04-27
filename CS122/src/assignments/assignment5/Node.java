package assignments.assignment5;

public class Node {
	private Node next;
	private Object element;
	
	public Node() {
		next = null;
		element = null;
	}
	//-------------------------------------------------------
	// Creates a node storing a specified element
	//-------------------------------------------------------
	public Node(Object element) {
		this.element = element;
	}
	
	//-------------------------------------------------------
	// Returns the node that follows this one
	//-------------------------------------------------------
	public Node getNext() {
		return next;
	}
	
	//-------------------------------------------------------
	// Sets the node that follows this one
	//-------------------------------------------------------
	public void setNext(Node node) {
		next = node;
	}
	
	//-------------------------------------------------------
	// Returns the element stored in this node
	//-------------------------------------------------------
	public Object getElement() {
		return element;
	}
	
	//-------------------------------------------------------
	// Sets the element stored in this node
	//-------------------------------------------------------
	public void setElement(Object element) {
		this.element = element;
	}
}

