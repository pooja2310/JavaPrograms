package basic_programs.reversenumber_palindrome;

public class Palindrome {
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
	
	public static boolean isPalindrome(int number) {
		int reverseNumber = reverse(number);
		if (reverseNumber == number) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Is Number palindrome:" + isPalindrome(-21212));
		System.out.println("Is Number palindrome:" + isPalindrome(15251));
		System.out.println("Is Number palindrome:" + isPalindrome(23144));
	}
}
