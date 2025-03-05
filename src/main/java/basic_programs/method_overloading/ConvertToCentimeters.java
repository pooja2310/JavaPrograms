package basic_programs.method_overloading;

public class ConvertToCentimeters {
	
	// Converts Inches to Centimeters
	public static double convertToCentimeters(int heightInInches) {
		return heightInInches * 2.54;
	}
	
	// Converts Feet to Inches
	public static double convertToCentimeters(int heightInFeet, int heightInInches) {
		// Feet to inches
		int inches = heightInFeet * 12;
		double result1 = convertToCentimeters(inches);
		
		System.out.println(heightInFeet + " Feet = " + inches + " inches");
		double result2 = convertToCentimeters(heightInInches);
		
		return result1 + result2;
	}
	
	public static void main(String[] args) {
		System.out.println("total height in centimeters : " + convertToCentimeters(5, 8));
	}
	
	// 5 feet 8 inches = 172.72 cms
}
