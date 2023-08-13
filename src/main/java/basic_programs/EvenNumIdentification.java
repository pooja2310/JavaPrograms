package basic_programs;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumIdentification
{

        public static void main (String[] args)
        {
            int count =0;
            ArrayList<Integer> ar= new ArrayList<>(Arrays.asList(2,4,3,7,0));
            int Size= ar.size();
            System.out.println("Size :"  +Size);
            for(int i=0; i< Size ;i++)
            {
                 if(ar.get(i) %2==0)
                 {

                        System.out.println("Even number is : " + Arrays.asList(ar.get(i)));
                     count++;
                 }

             }
            System.out.println("Count of Even number: " +count);
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter size of arrayList");
//             int size = sc.nextInt();
//             int arr [] = new int[size];
//            System.out.println("Enter number of elements");
//            for(int i=0; i< size ;i++)
//            {
//                arr[i]= sc.nextInt();
//            }
//
//             for(int i=0; i< size ;i++)
//             {
//
//                 if(arr[i]%2==0)
//                 {
//
//                        System.out.println("Even number is : " +arr[i]);
//                     count++;
//                 }
//
//             }
//            System.out.println("Count of Even number: " +count);

          //  --------------------------------------------------------------------------------------
        //            int number = 5891;
//                    int reverse = 0;
//            //while (number != 0)
//            for(;number!=0;)
//            {
//                int remainder = number % 10;
//                reverse = reverse * 10 + remainder;
//                number = number / 10;
//            }
//            System.out.println("The reverse of the given number is: " + reverse);
        }
}
