package basic_programs.decimal_comparator;

public class DecimalComparator {
	public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
		int comparator1 = (int) (number1 * 1000);
		int comparator2 = (int) (number2 * 1000);
		return comparator1 == comparator2;
	}
	
	public static void main(String[] args) {
		System.out.println("Is number same upto three decimal places : " + areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println("Is number same upto three decimal places : " + areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println("Is number same upto three decimal places : " + areEqualByThreeDecimalPlaces(3.0, 3.0));
		System.out.println("Is number same upto three decimal places : " + areEqualByThreeDecimalPlaces(-3.123, 3.123));
	}
}
