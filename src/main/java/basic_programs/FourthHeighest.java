package basic_programs;

import java.util.Arrays;

public class FourthHeighest
{
	
	public static void main(String[] args)
	{
		int num[] = {44, 66, 99, 77, 33, 22, 55,88};
		int temp;
		Arrays.sort(num); //sort in descending order
	  int	Length= num.length;
		System.out.println("length :" +Length);
		for (int i = 0; i < num.length/2; i++) {
			temp = num[i];
			num[i] = num[num.length - 1 - i];
			num[num.length - 1 - i] = temp;
		}
		
		if (num.length >= 4)
		{
			int fourthHighest = num[3];
			System.out.println("Fourth Highest: " + fourthHighest);
		} else
		{
			System.out.println("Array is not complete");
		}
	}
	
	}

