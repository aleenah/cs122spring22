package assignments.assignment6;

import java.util.*;
import java.util.Scanner;

public class ParenMatch {
	public static boolean ParenMatch(String line) {
		if ((line.length() % 2) == 1) {
			return false;
		} else {
			Stack<Character> s = new Stack<>();
			for (char bracket : line.toCharArray())
				switch (bracket) {
				case '(': s.push(')'); break;
				case ')': s.push('('); break;
				default: 
					if (s.isEmpty() || bracket != s.peek()) {
						return false;
					} s.pop();
			} return s.isEmpty();
		}
	}
	public static void main (String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter an expression:");
		String line = scnr.nextLine();
		boolean result = ParenMatch(line);
		if (result) {
			System.out.println("Parentheses match");
		} else {
			System.out.println("Parentheses don't match");
		}
	}
}
