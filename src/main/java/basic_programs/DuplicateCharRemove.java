package basic_programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharRemove
{
	public static String removeDuplicates(String str)
	{
		StringBuilder sb = new StringBuilder();
		Set<Character> seen = new HashSet<>();
		
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (!seen.contains(ch))
			{
				seen.add(ch);
				sb.append(ch);
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		String input = "pooja kanavaje";
		String result = removeDuplicates(input);
		
		System.out.println("Original string: " + input);
		System.out.println("String after removing duplicates: " + result);
	}
}
