package basic_programs.equality_printer;

public class EqualityPrinter {
	public static void printEqual(int num1, int num2, int num3) {
		if (num1 < 0 || num2 < 0 || num3 < 0)
			System.out.println("Invalid value");
		else if ((num1 == num2) && (num2 == num3) && (num3 == num1))
			System.out.println("All numbers are equal");
		else if ((num1 != num2) && (num2 != num3) && (num3 != num1)) {
			System.out.println("All numbers are different");
		} else if ((num1 == num2) && (num2 != num3) || ((num2 == num3) && (num3 != num1)))
			System.out.println("Neither all are equal or different");
	}
	
	public static void main(String[] args) {
		printEqual(1, 1, 1);
		printEqual(1, 2, 3);
		printEqual(1, -1, -1);
		printEqual(-6, -6, -6);
		printEqual(2, 6, 6);
		printEqual(2, 2, 6);
		
		
	}
}
