package basic_programs;

import java.util.*;

public class StreamFunction
{
    public static void main(String args[])
    {
        // Find number in list which is starting from 1

        List<Integer> list = Arrays.asList(23, 10, 15, 119, 200);
        list.stream().map(s -> s + "")     // int to string
                .filter(s -> s.startsWith("1")).forEach(System.out::println);
       // System.out.println(count); //int count ;
    }

   
}