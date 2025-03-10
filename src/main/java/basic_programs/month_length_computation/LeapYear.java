package basic_programs.month_length_computation;

public class LeapYear {
	public static boolean isLeapYear(int year) {
		if (year >= 1 && year <= 9999) {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						return true;
					} else return false;
				} else return true;
			} else return false;
		} else
			return false;
	}
	
	// Traditional Loop
	public static int getDaysInMonth(int month, int year) {
		int result;
		switch (month) {
			case 1, 3, 5, 8, 10, 12:
				result = 31;
				break;
			case 4, 7, 9, 11:
				result = 30;
				break;
			case 2:
				result = isLeapYear(year) ? 29 : 28;
				break;
			default:
				result = -1;
		}
		return result;
	}
	
	// Enhanced Switch
	public static int getDaysInMonth1(int month, int year) {
		return switch (month) {
			case 1, 3, 5, 8, 10, 12 -> 31;
			case 4, 7, 9, 11 -> 30;
			case 2 -> isLeapYear(year) ? 29 : 28;
			default -> {
				System.out.println("Invalid data");
				yield -1;
			}
		};
	}
	
	public static void main(String[] args) {
		int result = getDaysInMonth(2, 2020);
		if (result == -1)
			System.out.println("Invalid data");
		else
			System.out.println("Number of days: " + result);
		
		
		System.out.println("Number of days: " + getDaysInMonth1(-2, 2020));
		System.out.println("Number of days: " + getDaysInMonth1(1, 2020));
	}
}
