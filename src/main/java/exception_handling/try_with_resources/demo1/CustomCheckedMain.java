package exception_handling.try_with_resources.demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomCheckedMain {
	static String fileName = "Input.poo";
	
	public static void main(String[] args) throws FileNotFoundException, MyIncorrectFileException {
		
		try (Scanner file = new Scanner(new File(fileName))) {
			if (file.hasNextLine())
				System.out.println(file.nextLine());
			
		} catch (FileNotFoundException exception) {
			
			System.err.println("File Name or File Extension has issues: "+ exception.getMessage());
			
			if (!isFileNameValid(fileName))
				throw new MyIncorrectFileException("File name is not correct: " + fileName, exception);
			
				// throw new MyIncorrectFileException("File name is not correct: " + fileName);
			
		}
	}
	
	private static boolean isFileNameValid(final String fileName) {
		return fileName.contains(".txt") || fileName.contains(".pdf") || fileName.contains(".xml");
	}
}
