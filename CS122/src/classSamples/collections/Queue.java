package classSamples.collections;
import java.util.LinkedList;

public class Queue {
	LinkedList<String> theQueue;
	
	public Queue() {
		this.theQueue = new LinkedList<String>();
	}
	
	public void enqueue(String s) {
		theQueue.add(s);
	}
	
	public Object dequeue() {
		return theQueue.remove();
	}
	
	public boolean empty() {
		return theQueue.isEmpty();
	}
	
	public String peek() {
		return theQueue.peek();
	}
	
	public String toString() {
		return 
	}
}
