package basic_programs;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PanValidator
{
	
		// Regular expression pattern to match a valid PAN card format
		private static final String PAN_REGEX = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		
		public static  boolean validatePAN(String pan)
		{
			// Check if the input matches the PAN card pattern
			Pattern pattern = Pattern.compile(PAN_REGEX);
			Matcher matcher = pattern.matcher(pan);
			
			return matcher.matches();
		}
		
		public static void main(String[] args)
		{
			// Example PAN cards for testing
			String[] panCards = {
					"ABCDE1234F", // Valid PAN
					"ABCD1234F",  // Invalid PAN (missing a character)
					"ABCDE12345", // Invalid PAN (extra character)
					"AB1CD1234F", // Invalid PAN (numeric in the first five characters)
					"ABCDE1234G", // valid PAN (alphabetic in the last character)
					"12345ABCDE"  // Invalid PAN (wrong order)
			};
			
			for (String pan : panCards)
			{
				boolean isValid = validatePAN(pan);
				System.out.println("PAN: " + pan + " is valid: " + isValid);
			}
		}
}


