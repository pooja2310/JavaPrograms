package basic_programs.speed_converter;

import java.util.Scanner;

public class SpeedConverterMain extends SpeedConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a input :");
		double speedUnit = scanner.nextDouble();
		printConversion(speedUnit);
	}
	
}