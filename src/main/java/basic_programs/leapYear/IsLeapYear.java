package basic_programs.leapYear;

public class IsLeapYear {
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
	
	public static void main(String[] args) {
		System.out.println("-1600 isLeapYear : " + isLeapYear(-1600));
		System.out.println("1600 isLeapYear : " + isLeapYear(1600));
		System.out.println("2017 isLeapYear : " + isLeapYear(2017));
		System.out.println("2000 isLeapYear : " + isLeapYear(2000));
		System.out.println("1924 isLeapYear : " + isLeapYear(1924));
		System.out.println("2400 isLeapYear : " + isLeapYear(2400));
		System.out.println("1700 isLeapYear : " + isLeapYear(1700));
		System.out.println("1900 isLeapYear : " + isLeapYear(1900));
		System.out.println("2600 isLeapYear : " + isLeapYear(2600));
		
		
	}
}


