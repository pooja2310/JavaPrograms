package basic_programs;

public class HighestNum
{
	public static void main(String args[])
	{
		int arr[]={2,1,4,5,9,7};
		int heightest= arr[0];
		int len= arr.length;
		System.out.println("Length of array : " +len);
		for(int i=1;i<len;i++)
		{
			if(arr[i]>heightest)
				heightest=arr[i];
			
		}
		System.out.println("Maximum Num :" +heightest);
	}
}
