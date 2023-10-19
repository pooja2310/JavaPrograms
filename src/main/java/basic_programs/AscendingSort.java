package basic_programs;

import java.util.Arrays;

public class AscendingSort
{
	public static void main(String args[])
	{
	   int arr[]= {3,87,4,6,56,1};
	   int temp;
	   for(int i=0;i<arr.length;i++)
	   {
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if (arr[i] > arr[j])    //if (arr[i] < arr[j])  //descending order
			   {
				  temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			   }
		   }
	   }
		System.out.println("AscendingSort :" +Arrays.toString(arr));
	}
}
