package basic_programs.gcd;

public class GetGreatestCommonDivisor {
	/*public static int getGreatestCommonDivisor(int first, int second, int temp) {
		int result = 0;
		int factors1[] = getFactors(first); // 12
		int factors2[] = getFactors(second); // 30
		for (int i = 0; i <factors1.length; i++) {
			if ((factors2[i] == factors1[i]) && (factors2[i] != 0 && factors1[i]!=0))
				result = factors1[i];
		}
		return result;
	}
	
	static int[] getFactors(int number) {
		int[] result = new int[number];
		for (int i = 1,count=0; i <= number; i++) {
			if (number % i == 0) {
				result[count] = i;
				count++;
			}
		}
		return result;
	}
	*/
	
	public static int getGreatestCommonDivisor(int first, int second) {
		if (first < 10 || second < 10)
			return -1;
		
		int gcdResult = 0;
		for (int count = 1; count <= first; count++) {
			if (first % count == 0 && second % count == 0)
				gcdResult = count;
		}
		return gcdResult;
	}
	
	public static void main(String[] args) {
		System.out.println("GCD for 12 & 30 = " + getGreatestCommonDivisor(12, 30)); // 6
		System.out.println("GCD for 25 & 15 = " + getGreatestCommonDivisor(25, 15)); // 5
		System.out.println("GCD for 9 & 18 = " + getGreatestCommonDivisor(9, 18)); // -1
		System.out.println("GCD for 81 & 153 = " + getGreatestCommonDivisor(81, 153)); // 9
	}
	
}
