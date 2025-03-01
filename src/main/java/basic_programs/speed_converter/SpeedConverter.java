package basic_programs.speed_converter;

public class SpeedConverter {
	
	public static long toMilesPerHour(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			System.out.println("Invalid value");
			return -1;
		} else {
			long convert = Math.round(kilometersPerHour / 1.609);
			System.out.println(kilometersPerHour + " km/h = " + convert + " mi/h");
		}
		return 0;
	}
	
	public static void printConversion(double kilometersPerHour) {
		toMilesPerHour(kilometersPerHour);
	}
}
