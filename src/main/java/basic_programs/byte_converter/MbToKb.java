package basic_programs.byte_converter;

import java.util.Scanner;

public class MbToKb {
	static public void printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes < 0)
			System.out.println("invalid value");
		else {
			System.out.println(kiloBytes + " KB = " + kiloBytes / 1024 + " MB " + "And " + kiloBytes % 1024 + " KB");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value1 : ");
		int input = scanner.nextInt();
		printMegaBytesAndKiloBytes(input);
		System.out.println("Enter a value2 : ");
		int input2 = scanner.nextInt();
		printMegaBytesAndKiloBytes(input2);
		
	}
}
