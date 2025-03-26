package basic_programs.perfect_number;

public class IsPerfectNumber {
	public static boolean isPerfectNumber(int number) {
		boolean result = false;
		int i;
		int sum = 0;
		if (number > 1) {
			for (i = 1; i < number; i++) {
				int r = number % i;
				if (r == 0) {
					sum = sum + i;
				}
				if (sum == number) {
					return true;
				}
			}
		} else return false;
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Is number perfect :" + isPerfectNumber(6));
		System.out.println("Is number perfect :" + isPerfectNumber(28));
		System.out.println("Is number perfect :" + isPerfectNumber(5));
		System.out.println("Is number perfect :" + isPerfectNumber(-6));
	}
}
