package basic_programs;

public class Pyramid
{
	public static void main(String args[])
	{
		int count =1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" " +count);
				++count;
			}
		}
		
		
	}
}
