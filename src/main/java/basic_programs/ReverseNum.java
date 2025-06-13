package basic_programs;

import java.util.HashMap;

public class ReverseNum {
	public static void main(String args[]) {
		int rev = 0;
		int num = 129;
		int remainder;
		while (num > 0) {
			remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;
		}
		System.out.println("ReverseNum : " + rev);
		
		String str= "Pooja Automation Testing Tool";
		String words=str.replaceAll("[^a-zA-z]","");
		System.out.println(words);
		int len=words.length();
		HashMap<Character,Integer> map=  new HashMap<Character, Integer>();
		for(int i=0;i<len;i++)
		{
			if(map.containsKey(words.charAt(i)))
			{
				int count= map.get(words.charAt(i));
				map.put(words.charAt(i),++count );
			}else
				map.put(words.charAt(i), 1);
		}
		System.out.println(map);
	}
	}

