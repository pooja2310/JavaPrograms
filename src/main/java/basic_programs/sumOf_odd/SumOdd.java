package basic_programs.sumOf_odd;

public class SumOdd {
	public static boolean isOdd(int number) {
		if (number > 0) {
				if (number % 2 != 0) {
					return true;
				} else return false;
			
		} else return false;
	}
	
	public static int sumOdd(int start, int end) {
		int sum = 0;
		if (start > 0 && end >= start) {
			for (int  i = start; i <= end; i++) {
				if (isOdd(i)) {
					sum = sum + i;
				}
			}
			
		} else return -1;
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Sum of odd number from given 1 to 100 range is " +sumOdd(1,100));
		System.out.println("Sum of odd number from given -1 to 100 range is " +sumOdd(-1,100));
		System.out.println("Sum of odd number from given 100 to 100 range is " +sumOdd(100,100));
		System.out.println("Sum of odd number from given 13 to 13 range is " +sumOdd(13,13));
		System.out.println("Sum of odd number from given 100 to -100 range is " +sumOdd(100,-100));
		System.out.println("Sum of odd number from given 100 to 1000 range is " +sumOdd(100,1000));
		System.out.println("Sum of odd number from given 1000 to 10 range is " +sumOdd(1000,10));
		
	}
	
}
