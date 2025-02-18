package collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetToArray {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Emily");
		set.add("Harry");
		set.add("Ross");
		set.add("joey");
		set.add("Rach");
		
		System.out.println(set);
		String arr[] = new String[set.size()];
		set.toArray(arr);
		for(String str : arr)
		{
			System.out.println("Set to Array conversion : "  +str);
		}
	}
}
