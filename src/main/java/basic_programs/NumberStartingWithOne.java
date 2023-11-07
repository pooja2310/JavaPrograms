package basic_programs;
import java.util.ArrayList;
import java.util.List;

public class NumberStartingWithOne {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(12);
		numbers.add(32);
		numbers.add(15);
		numbers.add(17);
		numbers.add(44);
		
		Integer numberStartingWithOne ;
		
		for (Integer number : numbers)
		{
			String numberString = number.toString();
			if (numberString.startsWith("1"))
			{
				numberStartingWithOne = number;
				
				System.out.println("Number starting with 1: " + numberStartingWithOne);
			}
			else
			{System.out.println("No Number found starting with 1" );}
		}
	}
}

