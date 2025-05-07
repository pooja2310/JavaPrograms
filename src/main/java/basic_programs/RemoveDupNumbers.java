package basic_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupNumbers {
	public static void main(String argsp[]) {
//		Integer[] numbers = {1, 2, 2, 3, 4, 5, 3, 4};
//		Set<Integer> set = new HashSet<>(List.of((numbers)));
//		//convert set array
//		Integer[] WithoutDuplicate = set.toArray(new Integer[0]);
//		System.out.println(Arrays.toString(WithoutDuplicate));
		/*-----------------------------Other Approach--------------------------------*/
		int[] numbers2 = {7, 2, 7, 2, 4, 4, 5};
		
		int[] result = Arrays.stream(numbers2)
				.distinct()  // removes duplicates
				.toArray();
		
		System.out.println(Arrays.toString(result));
	}
}
