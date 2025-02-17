package basic_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates
{
	public static void main(String argsp[]) {
		Integer[] numbers = {1, 2, 2, 3, 4, 5, 3, 4};
		Set<Integer> set = new HashSet<>(Arrays.asList(numbers));
		//convert set array
		Integer[] WithoutDuplicate = set.toArray(new Integer[0]);
		System.out.println(Arrays.toString(WithoutDuplicate));
		System.out.println((WithoutDuplicate));
	}
}
