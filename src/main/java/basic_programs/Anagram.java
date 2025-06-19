package basic_programs;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		
		//An anagram is a word or phrase formed by rearranging the letters of another word or phrase. e.g elbow -> below
		String str = "listen";
		String str2 = "silent";
		String withoutSpace = str.replaceAll("\\d", "").toLowerCase();  // "\\d" removes white space
		String withoutSpace1 = str2.replaceAll("\\d", "").toLowerCase();
		if (withoutSpace.length() == withoutSpace1.length()) {
			char[] arr1 = withoutSpace.toCharArray();
			char[] arr2 = withoutSpace1.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				System.out.println("Two strings are Anagram");
			} else
				System.out.println("Two strings are not Anagram");
		}
	}
}
