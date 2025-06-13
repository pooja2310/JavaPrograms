package basic_programs;

import java.util.Scanner;

public class NameInitials {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input full name
		System.out.print("Enter first name: ");
		String firstName = scanner.nextLine();
		
		System.out.print("Enter middle name: ");
		String middleName = scanner.nextLine();
		
		System.out.print("Enter surname: ");
		String surname = scanner.nextLine();
		
		// Extract and print initials
		String initials = "" + firstName.charAt(0) + middleName.charAt(0) + surname.charAt(0);
		System.out.println("Initials: " + initials.toUpperCase());
		
		scanner.close();
	}
}



