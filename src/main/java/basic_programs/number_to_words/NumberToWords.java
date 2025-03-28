package basic_programs.number_to_words;

public class NumberToWords {
	public static int getDigitCount(int number) {
		int count = 0;
		if (number > 0) {
			while ((number > 0)) {
				number /= 10;
				count++;
			}
		} else if (number == 0) {
			number /= 10;
			count++;
		} else return -1;
		return count;
	}
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
		System.out.println("Digit Count : " + getDigitCount(123));
		System.out.println("Digit Count : " + getDigitCount(0));
		System.out.println("Digit Count : " + getDigitCount(-9));
		System.out.println("Digit Count : " + getDigitCount(5200));
		System.out.println("Reverse number is :" + reverse(-123));
		System.out.println("Reverse number is :" + reverse(1212));
		System.out.println("Reverse number is :" + reverse(10));
		System.out.println("Reverse number is :" + reverse(1000));
		
	}
}
