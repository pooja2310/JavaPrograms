package basic_programs.time_conversion;

public class PrintYearsAndDays {
	public static void printYearsAndDays(long minutes) {
		long year = 0;
		long days;
		long hour = 0;
		if (minutes < 0)
			System.out.println("Invalid value");
		else {
			hour = minutes / 60;
			days = hour / 24;
			year = days / 365;
			long remainder = days % 365;
			System.out.println(minutes + " min = " + year + "y" + " And " + remainder + "d");
		}
	}
	
	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);
	}
}
