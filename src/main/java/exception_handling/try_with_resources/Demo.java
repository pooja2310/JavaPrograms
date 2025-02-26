package exception_handling.try_with_resources;

import java.io.*;

public class Demo {
	
	// Java code illustrating try-with-resource

	static String filePath = "/Users/sandipkumbhar/IdeaProjects/CucumberProj/Input.txt";
	
		public static void main(String args[]) throws IOException
		{
			File file = new File(filePath);
			
			// Automatic Resource management
			// By using try-with-resources, we avoid the need of writing the finally block
			try(BufferedReader br = new BufferedReader(new FileReader(file));
				FileReader fr = new FileReader(filePath))
			{
				String st = br.readLine();
				System.out.println("String Printed using BufferedReader: " + st);
			}
			
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			FileReader fileReader = new FileReader(filePath);
			try {
				String st = bufferedReader.readLine();
				System.out.println("String Printed using BufferedReader: " + st);
			} finally {
				// De-allocation of Resources manually/explicitly
				bufferedReader.close();
				fileReader.close();
			}
			
		}
	
}
