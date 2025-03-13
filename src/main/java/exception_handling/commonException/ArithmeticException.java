package exception_handling.commonException;

public class ArithmeticException {
	
	public static void main(String[] args) {
		int dividend = 10;
		int divisor = 0;
		// attempting division by zero
		int result = dividend / divisor;
		// print the result
		System.out.println("Result: " + result);
		
	}
}
