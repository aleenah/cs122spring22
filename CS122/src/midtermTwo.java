import java.util.Scanner;

import assignments.assignment4.DocumentException;

public class midtermTwo extends Exception {
	public static void main(String[] args) throws OddException {
		Scanner scnr = new Scanner(System.in);
		String input = scnr.next();
		System.out.println(input);
				
	//checks if first two characters of user input is an int or not
		try {
			if (!Character.isDigit(input.charAt(0))) {
				throw new OddException("First 2 characters should be integer not string");
			} else if (!Character.isDigit(input.charAt(1))) {
				throw new OddException("First 2 characters should be integer not string");
			}
		}
		
//		try {
//			if (divideByTwo(n) == 3) {
//				throw new OddException ("Code should be even");
//			}
//		}
		
		catch(OddException e) {
	        System.out.println(e);
	} 
		
		//takes first two characters from input string and turns it into an int
		String str = input.substring(0,2);
		int n = Integer.parseInt(str);
		System.out.println(n);
	
//	try {
//		if (n==3) {
//			throw new OddException("Code should be even");
//		} else {
//			return 2 / divideByTwo(n-1);
//		}
//	}
}
}

	
	

