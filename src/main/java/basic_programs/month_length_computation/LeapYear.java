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
	public static boolean getDaysInMonth(int month , int year){
		
	}
}
