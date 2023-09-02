package basic_programs;

public class Sum_Digitsum
{
	public static void main(String args[])
	{
		int nums[] = {11, 15, 61, 33};
		int sum = 0;
		for (int i = 0; i < nums.length; i++)
		{
			sum = sum + nums[i];
		}
		System.out.println("Sum of numbers:" + sum);
		for(int sumOfDigit: nums)
		digitSum(sumOfDigit);
		
	}
		public static int digitSum ( int number)
		{
			int digitSum = 0;
			while (number > 0) {
				int remainder = number % 10;
				digitSum = digitSum + remainder;
				number = number / 10;
			}
			System.out.println("Sum of digit:" + digitSum);
			return digitSum;
		}
}

