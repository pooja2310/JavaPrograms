package exception_handling.custom_exception;

import java.util.Scanner;

public class MainThrows {
	public static void main(String[] args) throws DivideByZeroException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Numerator number: ");
		int numerator = in.nextInt();
		
		System.out.println("Enter Denominator number: ");
		int denominator = in.nextInt();
		
		int result = Main.divide(numerator, denominator);
		System.out.println("Division Operation of: " + numerator + " / " + denominator + " = " + result);
		
		
	}
}
