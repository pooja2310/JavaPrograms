package basic_programs;


public class SecondHighestNumberInArray {
	public static void main(String[] args) {
		int arr[] = {2, 5, 1, 7, 8, 10};
		int largest = 0;
		int secondLargest = 0;
		System.out.println("The given array is:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			if ((arr[i] < largest) && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("\nSecond largest number is:" + secondLargest);
		System.out.println("Largest Number is: " + largest);
	}
}


