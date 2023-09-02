package basic_programs;

public class ReverseNum {
	public static void main(String args[])
	{
		int rev = 0;
		int num = 129;
		int remainder;
		while (num > 0)
		{
			remainder= num%10;
			rev= rev*10 +remainder;
			num= num/10;
		}
		System.out.println("ReverseNum : " + rev);
	}
}
