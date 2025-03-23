package basic_programs.factor_of_number;

public class PrintFactors {
	public static void printFactors(int number) {
		//System.out.println("All Factors of number ");
		if (number > 1) {
			for (int i = 1; i <= number; i++) {
				int r = number % i;
				if (r == 0)
					System.out.println(i);
			}
		} else
			System.out.println("Invalid value");
	}
	
	public static void main(String[] args) {
//		int[] result = printFactors(6, 0, 0);
//		for (int i : result) {
//			System.out.print(i + " ");
//		}
		
		printFactors(32);
		String factor = printFactors(10, 0);
		System.out.println(factor);
		// printFactors(-1);
	}
	
	public static String printFactors(int number, int num) {
		String result = null;
		if (number > 1) {
			StringBuilder sb = new StringBuilder();
			
			for (int count = 1; count <= number; count++) {
				if (number % count == 0) {
					sb.append(count).append(" ");
					result = sb.toString();
				}
			}
		} else
			System.out.println("Invalid value");
		
		return result;
	}
	
	public static int[] printFactors(int number, int num, int num1) {
		int[] result = new int[number];
		if (number > 1) {
			for (int count = 1, i = 0;
				 count <= number;
				 count++) {
				
				if (number % count == 0) {
					result[i++] = count;
				}
			}
		} else
			System.out.println("Invalid value");
		
		return result;
	}
}

