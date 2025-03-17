package basic_programs.sumOf_even;

public class GetEvenDigitSum {
	public static int getEvenDigitSum(int number) {
		int sum = 0;
		if (number > 0) {
			while (number > 0) {
				int r = number % 10;
				number = number / 10;
				if (r % 2 == 0) {
					sum = sum + r;
				}
			}
		} else return -1;
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Sum of even digit : " + getEvenDigitSum(123456789));
		System.out.println("Sum of even digit : " + getEvenDigitSum(252));
		System.out.println("Sum of even digit : " + getEvenDigitSum(-22));
	}
}
