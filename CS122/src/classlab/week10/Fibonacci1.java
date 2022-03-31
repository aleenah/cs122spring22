package classlab.week10;

public class Fibonacci1 {
	public static int fib(int num) {
		int result; 
		if(num==0) {
			System.out.print(0+"\t");
			return 0;
		}
		
		if(num==1) {
			System.out.print(1+"\t");
			return 1;
		}
		
		else {
			result= fib(num-1) + fib(num-2);
			System.out.print(result + "\t");
			return result;
		}
	}
	
	public static void main(String[] arg) {
		fib(11);
	}

}
