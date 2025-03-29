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
	
	public static String numberToWords(int number) {
		// TODO : Negative Number condition    on input number
		int r;
		String result = null;
		if (number > 0) {
			int reverseNum = reverse(number);
			while ((reverseNum > 0)) {
				r = reverseNum % 10;
				reverseNum /= 10;
				switch (r) {
					case 0 -> {
						result = "Zero";
						System.out.println(result);
					}
					case 1 -> {
						result = "One";
						System.out.println(result);
					}
					case 2 -> {
						result = "Two";
						System.out.println(result);
					}
					case 3 -> {
						result = "Three";
						System.out.println(result);
					}
					case 4 -> {
						result = "Four";
						System.out.println(result);
					}
					case 5 -> {
						result = "Five";
						System.out.println(result);
					}
					case 6 -> {
						result = "Six";
						System.out.println(result);
					}
					case 7 -> {
						result = "Seven";
						System.out.println(result);
					}
					case 8 -> {
						result = "Eight";
						System.out.println(result);
					}
					case 9 ->
						System.out.println("Nine");
					default -> System.out.println("Invalid data");
				}
			}
		} else System.out.println("Invalid data");
		
		return result;
	}
	
	public static void main(String[] args) {
	System.out.println("Digit Count : " + getDigitCount(100));
		/*System.out.println("Digit Count : " + getDigitCount(0));
		System.out.println("Digit Count : " + getDigitCount(-9));
		System.out.println("Digit Count : " + getDigitCount(5200));
		System.out.println("Reverse number is :" + reverse(-123));
		System.out.println("Reverse number is :" + reverse(1212));
		System.out.println("Reverse number is :" + reverse(10));
		System.out.println("Reverse number is :" + reverse(1000));  */
		//numberToWords(123);
		//numberToWords(0);
		//numberToWords(1010);
		//numberToWords(1000);
		//numberToWords(-12);
		
		
	}
}
