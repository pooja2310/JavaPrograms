package basic_programs.same_lastDigit;

public class HasSameDigit {
	public static boolean hasSameDigit(int number1, int number2, int number3) {
		if (isValid(number1) && isValid(number2) && isValid(number3)) {
			int r1 = number1 % 10;
			int r2 = number2 % 10;
			int r3 = number3 % 10;
			if (r1 == r2)
				return true;
			else if (r2 == r3) {
				return true;
			} else
				return r1 == r3;
		}
		return false;
	}
	
	public static boolean isValid(int number) {
		return number >= 10 && number <= 1000;
	}
	
	public static void main(String[] args) {
		System.out.println(hasSameDigit(41, 22, 71));
		System.out.println(hasSameDigit(23, 32, 42));
		System.out.println(hasSameDigit(9, 99, 999));
		
	}
}
