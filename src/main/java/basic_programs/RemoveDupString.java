package basic_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDupString {
	public static void main(String[] args) {
		String str = "Remove Duplicates value Remove Duplicates";
		String[] word = str.split(" ");
		List<String> list1 = new ArrayList<>(Arrays.asList(word));
		List<String> list2 = new ArrayList<>();
		for (int i = 0; i < word.length; i++) {
			if (!list2.contains(list1.get(i))) {
				list2.add(list1.get(i));
			}
		}
		System.out.println(list2);
	}
}