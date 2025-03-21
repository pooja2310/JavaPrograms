package basic_programs.summation_first_lastdigit;

public class SumFirstAndLastDigit {
	public static int sumFirstAndLastDigit(int number) {
		int result;
		int count = 0;
		int r = 0;
		int lastDigit = 0;
		int firstDigit = 0;
		if (number >= 0) {
			while (number > 0) {
				r = number % 10;
				count++;
				if (count == 1) {
					lastDigit = r;
				}
				number = number / 10;
			}
			if (number == 0) {
				firstDigit = r;
			}
			result = lastDigit + firstDigit;
		} else return -1;
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Summation of first and last digit is :" + sumFirstAndLastDigit(252));
		System.out.println("Summation of first and last digit is :" + sumFirstAndLastDigit(5));
		System.out.println("Summation of first and last digit is :" + sumFirstAndLastDigit(0));
		System.out.println("Summation of first and last digit is :" + sumFirstAndLastDigit(-10));
		System.out.println("Summation of first and last digit is :" + sumFirstAndLastDigit(5257));
	}
}
