package basic_programs.digit_sum;

import java.util.Scanner;

public class SumDigits {
	public static int sumDigits(int number) {
		int sum = 0;
		if (number > 0) {
			while (number > 0) {
				sum = sum + number % 10;
				number = number / 10;
			}
		} else
			return -1;
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A number :");
		int num = scanner.nextInt();
		System.out.println("Sum of digits : " + sumDigits(num));
	}
}