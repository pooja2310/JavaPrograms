package basic_programs.Sum_3_5;

public class SumOfNumbers {
	public static void sumOfNumbers() {
		int count = 0;
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Number:" + i);
				sum = sum + i;
				System.out.println("Sum :" + sum);
				count++;
				if (count == 5) {
					break;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		sumOfNumbers();
	}
}
