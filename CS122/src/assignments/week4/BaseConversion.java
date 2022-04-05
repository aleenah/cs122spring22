package assignments.week4;

import java.util.Scanner;


public class BaseConversion {
	
	public static void main(String[] args) {
		int base10num; 
		int base; 
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Base Conversion Program");
		System.out.print("Enter an integer");
		base10num = scnr.nextInt();
		System.out.print("Enter the base");
		base = scnr.nextInt();
		convert(base10num, base);
	}
	
	public static String convert(int num, int b) {
		int quotient; 
		int remainder; 
		
		quotient = num/b;
		remainder = num%b; 
		
		if (remainder == 0) {
			return " " + remainder;
		} else {
			num = quotient;
			return (" " + remainder);
		}
	}
}
