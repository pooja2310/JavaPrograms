package basic_programs;

public class SwapNum
{
	public static void main(String args[])
	{
		int x=5;
		int y=3;
		System.out.println("Number Before Swapping :" +x +" " +y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Number After Swapping :" +x +" " +y);
	}
}

