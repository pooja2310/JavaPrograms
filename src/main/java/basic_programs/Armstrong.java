package basic_programs;

public class Armstrong
{
    public static void main(String args[])
    {
        int num = 153;
        System.out.println("input");
        int sum = 0;
        int temp;
        temp = num;
        while (num > 0) {
            sum = sum + ((num % 10) * (num % 10) * (num % 10));  //0+0  , 125 ,
            num = num / 10;
        }
        System.out.println("number is :" +sum);
            if (sum == temp)
            {
                System.out.println("Number is Armstrong");

            } else
            {
                System.out.println("Number is not armstrong");
            }
    }
}
