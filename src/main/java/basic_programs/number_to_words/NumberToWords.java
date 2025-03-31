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
		int remainder;
		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			reverse = reverse * 10 + remainder;
		}
		return reverse;
	}
	
	public static void numberToWords(int number) {
		int digit;
		if (number >= 0) {
			if (number == 0) {
				System.out.println("Zero");
				return;
			}
			
			int reverseNum = reverse(number);
			int difference = getDigitCount(number) - getDigitCount(reverseNum);
			while ((reverseNum > 0)) {
				digit = reverseNum % 10;
				reverseNum /= 10;
				
				switch (digit) {
					case 1 -> System.out.println("One");
					case 2 -> System.out.println("Two");
					case 3 -> System.out.println("Three");
					case 4 -> System.out.println("Four");
					case 5 -> System.out.println("Five");
					case 6 -> System.out.println("Six");
					case 7 -> System.out.println("Seven");
					case 8 -> System.out.println("Eight");
					case 9 -> System.out.println("Nine");
					default -> System.out.println("Zero");
				}
			}
			
			if (difference > 0)
				for (int count = 1; count <= difference; count++)
					System.out.println("Zero");
			
		} else
			System.out.println("Invalid data");
	}
	
	public static void main(String[] args) {
		//System.out.println("Digit Count : " + getDigitCount(1010));
		//System.out.println("Digit Count : " + getDigitCount(101));
		/*System.out.println("Digit Count : " + getDigitCount(-9));
		System.out.println("Digit Count : " + getDigitCount(5200));
		System.out.println("Reverse number is :" + reverse(-123));
		System.out.println("Reverse number is :" + reverse(1212));
		System.out.println("Reverse number is :" + reverse(10));*/
		//System.out.println("Reverse number is :" + reverse(1010));
		
		numberToWords(123);
		System.out.println();
		numberToWords(0);
		System.out.println();
		numberToWords(10_100);
		System.out.println();
		numberToWords(10_00_000);
		System.out.println();
		numberToWords(-12);
	}
}
