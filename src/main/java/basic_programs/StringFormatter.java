package basic_programs;


   /* public class StringFormatter
    {
        public static String reverseString(String str) {
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            return sb.toString();
        }


        public static void main(String[] args) {
            System.out.println(cucumberTest.StringFormatter.reverseString("my name is khan"));
            System.out.println(cucumberTest.StringFormatter.reverseString("I am sonoo jaiswal"));
        }
    }
    
    */

 /* public static String reverseWord(String str)
  {
  String words[]=str.split("\\s");
    String reverseWord="";
    for(String w:words){
        StringBuilder sb=new StringBuilder(w);
        sb.reverse();
        reverseWord+=sb.toString()+" ";
    }
    return reverseWord.trim();
}

        public static void main(String[] args)
        {
            System.out.println(StringFormatter.reverseWord("Pooja Kanavaje"));    // output : ajoop ejavanak
            System.out.println(StringFormatter.reverseWord("I am sonoo jaiswal"));
        }
    }
    
  */

public class StringFormatter {

    public static void main(String[] args)
    {
        String str= "I am Pooja";
        System.out.println("Input String : " + "\"I am Pooja\"");
        String spl[] = str.split(" ");
        StringBuilder reverse= new StringBuilder();
        for(int i= spl.length-1;i>=0;i--)
        {
            reverse.append(spl[i]).append(" ");
        }
//       String outputString = reverse.toString().trim();
//        System.out.println("Reverse String : " +outputString);
        System.out.println("Reverse String : " +reverse);
    }
}
