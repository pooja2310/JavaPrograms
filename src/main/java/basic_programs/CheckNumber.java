package basic_programs;

import java.util.Scanner;

public class CheckNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		checkNumber(a);
	}
	
	public static void checkNumber(int num) {
		if (num > 0)
			System.out.println("This number is Positive");
		else if (num < 0) {
			System.out.println("This number is negative");
		} else {
			System.out.println("This Number is Zero");
		}
	}
	
}
