package exception_handling.custom_exception;

import java.util.Scanner;

public class Main {
	public static int divide(int a, int b) {
		if (b == 0) {
			throw new DivideByZeroException("Division by zero not possible");
		}
		return a / b;
	}
	
	public static void main(String[] args) {
		
		// Automatic Resource Handling
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter Numerator number: ");
			int numerator = in.nextInt();
			
			System.out.println("Enter Denominator number: ");
			int denominator = in.nextInt();
			
			int result = divide(numerator, denominator);
			System.out.println("Division Operation of: " + numerator + " / " + denominator + " = " + result);
			
		} catch (ArithmeticException | DivideByZeroException exception) {
			System.err.println("Caught exception : " + exception.getMessage());
		}
	}
}
