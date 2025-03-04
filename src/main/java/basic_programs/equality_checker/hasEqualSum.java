package basic_programs.equality_checker;

import basic_programs.Sum_Digitsum;

import java.util.Scanner;

public class hasEqualSum {
	public static boolean hasEqualSum(int num1, int num2, int num3) {
		int sum = num1 + num2;
		if (sum == num3) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		/* System.out.println(hasEqualSum(15, -1, 14));
		System.out.println(hasEqualSum(10, 0, 10));
		System.out.println(hasEqualSum(3, 2, 7));
		System.out.println(hasEqualSum(-9, -2, -11)); */
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter first number :");
		int firstNum=scanner.nextInt();
		System.out.println("Enter second number :");
		int secondNum=scanner.nextInt();
		System.out.println("Enter third number :");
		int totalSum=scanner.nextInt();
		System.out.println(hasEqualSum(firstNum,secondNum,totalSum));
	}
}
