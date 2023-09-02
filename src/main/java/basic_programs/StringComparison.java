package basic_programs;

public class StringComparison
{
	public static void main(String args[])
	{
		String word1[]={"ab","c"};
		String word2[]={"a","bc"};
	    checkString(word1,word2);
		
	}
	public static boolean checkString(String word1[],String word2[])
	{
		String str1=" ";
		String str2=" ";
		for(String s1:word1)
		{
			str1=str1+s1;
		}
		for(String s2:word2)
		{
			str2=str2+s2;
		}
		if(str1.equals(str2))
		{System.out.println("Strings are equal");}
		else {System.out.println("Strings are Unequal");}
		return true;
	}
	
	
}
