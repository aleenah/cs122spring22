package classlab.week7;

import java.util.Scanner;

public class ExceptionClass {
	public static void main (String[] args) {
		Scanner scnr = new Scanner(System.in);
		String input = scnr.nextLine();
		
		try {
			char zone = input.charAt(10);
			if (zone == 'Y') {
				System.out.println("Yes");
			}
			
			String zone2 = input.substring(2, 8);
			if (zone2.equals("CS122")) {
				System.out.println("inclass");
			}
		} 
		
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}
