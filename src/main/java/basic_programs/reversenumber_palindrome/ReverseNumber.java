package basic_programs.reversenumber_palindrome;

public class ReverseNumber {
	public static int reverse(int number) {
		int reverse = 0;
		while ((number > 0) || (number < 0)) {
			int remainder = 0;
			remainder = number % 10;
			number = number / 10;
			reverse = reverse * 10 + remainder;
			
		}
		
		return reverse;
	}
	
	public static void main(String[] args) {
		System.out.println("Reverse number is :" + reverse(5149));
		System.out.println("Reverse number is :" + reverse(-7136));
	}
}
