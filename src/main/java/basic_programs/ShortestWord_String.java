package basic_programs;

public class ShortestWord_String
{
	public static void main(String args[])
	{
		String S= "I am Winner";
	
		String words[]=S.split("");
		String short_word= words[0];
		for(String new_word: words)
		{
		   if(short_word.length()>new_word.length())
		   {
			   short_word=new_word;
		   }
		}
		System.out.println("Shortest Word :" +short_word);
	}
}
