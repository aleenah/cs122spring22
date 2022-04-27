package assignments.assignment5;
import java.util.Scanner;

public class IntListTest {
	private static Scanner scnr;
	private static IntList list = new IntList();
	
	public static void main(String[] args) {
		scnr = new Scanner(System.in); 
		printMenu();
		int choice = scnr.nextInt();
		while (choice != 0) {
			dispatch(choice);
			printMenu();
			choice = scnr.nextInt();
		}
	}
	
	public static void dispatch(int choice) {
		int newVal;
		switch(choice) {
		case 0:
			System.out.println("Bye!");
			break;
			
		case 1: 
			System.out.println("Enter integer to add to front");
			newVal = scnr.nextInt();
			list.addToEnd(newVal);
			break;
			
		case 2: 
			System.out.println("Enter an integer to add to the end");
			newVal = scnr.nextInt();
			list.addToEnd(newVal);
			break;
			
		case 3: 
			list.removeFirst();
			break;
			
		case 4: 
			list.print();
			break;
			
		case 5: 
			list.removeLast();
			break; 
			
		case 6: 
			System.out.println("Enter the integer you want to replace: ");
			System.out.println("Enter integer you want to replace it with: ");
			list.replace(scnr.nextInt(), scnr.nextInt()); 
			break;
			
		default: 
			System.out.println("Sorry, invalid choice");
		}
	}
	
	public static void printMenu() {
		System.out.println("\n Menu ");
		System.out.println(" ====");
		System.out.println("0: Quit");
		System.out.println("1: Add an integer to the front of the list");
		System.out.println("2: Add an integer to the end of the list");
		System.out.println("3: Remove an integer from the front of the list");
		System.out.println("4: Print the list");
		System.out.println("5: Remove the last int");
		System.out.println("6: Replace int x with int y");
		
		System.out.print("\nEnter your choice: "); 

	}
}
