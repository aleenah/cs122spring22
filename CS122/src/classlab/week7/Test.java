package classlab.week7;

public class Test {
	public static void main (String[] args) {
		int x = 1;
		int y = 0;
		
		try {
		System.out.println(x/y); 
		System.out.println("Hello");
		//int[] intarray = {0, 1, 2, 3, 4, 5, 6, 7};
		//System.out.println(intarray[10]); 
		}

	catch(Exception e) {
		System.out.println("Error occured");
		System.out.println(e.getMessage());
		e.printStackTrace();
		}
	finally {
		
	}
	}
}
