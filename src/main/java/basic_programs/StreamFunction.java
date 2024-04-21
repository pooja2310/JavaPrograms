package basic_programs;

import com.google.common.base.Predicate;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamFunction
{
    public static void main(String args[])
    {
        // Find number in list which is starting from 1

        List<Integer> number = Arrays.asList(23, 10, 15, 119, 200);
       Predicate<? super Integer> evenPredicate= x ->x%2==0;
        filterAndPrint(number.stream().filter(evenPredicate));
    
        Predicate<? super Integer> oddPredicate= x ->x%2!=0;
        filterAndPrint(number.stream().filter(oddPredicate));
    
        number.stream().map(s -> s + "")     // int to string
                .filter(s -> s.startsWith("1")).forEach(System.out::println);
       // System.out.println(count); //int count ;
        
    }
    
    private static void filterAndPrint(Stream<Integer> list) {
        list.forEach(System.out::println);
    }
    
    
}