package basic_programs;

public class Fibonacci
{
    public static void main(String args[]) {
    
        int[] nums = {0, 1, 1, 2, 3, 5};
    
      fibonacci(nums);
    
    
        System.out.println("It is fibonacci series");
    
    }

    public static boolean fibonacci(int nums[])
    {  int ans[] = new int[nums.length];
        ans[0]= nums[0];
        ans[1]= nums[1];

        for(int i=2;i<nums.length;i++)
        {
            ans[i]= nums[i-1]+nums[i-2];

        }
        return true;
    }
}

