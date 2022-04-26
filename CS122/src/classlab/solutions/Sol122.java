package classlab.solutions;

import java.util.Scanner;

public class Sol122 {
	public static void main(String[] args) {
		int num;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a num");
		try {
			num = Integer.parseInt(scnr.next().substring(0,2));
			subtract2(num);
		}
	}

}
