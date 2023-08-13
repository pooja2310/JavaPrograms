package basic_programs;

import java.util.HashMap;

public class OccurenceChar
{
    public static void main(String[] args) {
        String myStr = "pooja";
        System.out.println("String =" + myStr);
        int length= myStr.length();
        System.out.println("Length =" + length);
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < length; i++)
        {
            if (hashMap.containsKey(myStr.charAt(i)))
            {
                int count = hashMap.get(myStr.charAt(i));
                hashMap.put(myStr.charAt(i), ++count);
            }
            else {
                hashMap.put(myStr.charAt(i), 1);
            }
        }
        System.out.println("Counting occurrences of each character = "+hashMap);
    }
}

