package basic_programs.barking_dog;

import com.google.common.math.Quantiles;

import java.util.Scanner;

public class ShouldWakeUp {
	public static boolean shouldWeWakeUp(boolean barking, int hourOfDay) {
		if (barking) {
			if (hourOfDay < 0 || hourOfDay > 23)
				return false;
			else {
				if (hourOfDay < 8 || hourOfDay > 22)
					return true;
				else return false;
			}
		} else {
			return false;
		}
	}
	
	/*public static boolean shouldWeWakeUp(boolean barking, int hourOfDay) {
		boolean result = false;
		if (barking) {
			// Checks Valid value range (0 to 23)
			if (hourOfDay < 0 || hourOfDay > 23)
				result = false;
			else {
				// Scenario for Valid hours of the day
				if (hourOfDay < 8 || hourOfDay > 22)
					result = true;
			}
		}
		return result;
	}*/
	
	public static void main(String[] args) {
		System.out.println(shouldWeWakeUp(true, 1));
		System.out.println(shouldWeWakeUp(false, 2));
		System.out.println(shouldWeWakeUp(true, 8));
		System.out.println(shouldWeWakeUp(true, -1));
	}
}
