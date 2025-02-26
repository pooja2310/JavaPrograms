package exception_handling.try_with_resources.demo2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomUncheckedMain {
	static String fileName = null; //"Input";
	
	public static void main(String[] args) throws FileNotFoundException, MyNoFileExtensionException {
		
		try (Scanner file = new Scanner(new File(fileName))) {
			if (file.hasNextLine())
				System.out.println(file.nextLine());
			else
				throw new IllegalArgumentException("Not readable file");
			
		} catch (FileNotFoundException exception) {
			
			System.err.println("File Name or File Extension has issues: " + exception.getMessage());
			
			if (!isFileNameValid(fileName))
				throw new MyNoFileExtensionException("File name is not correct: " + fileName, exception);
			
		} catch (IllegalArgumentException exception2) {
			if (!isExtensionPresentException(fileName))
				throw new MyNoFileExtensionException("File dont have entension : " + fileName, exception2);
		}
	}
	
	private static boolean isExtensionPresentException(String fileName) {
		return fileName.contains(".txt") || fileName.contains(".pdf") || fileName.contains(".xml");
	}
	
	private static boolean isFileNameValid(final String fileName) {
		// return null != fileName && !fileName.isEmpty();
		if (null == fileName || fileName.isEmpty())
			return false;
		else
			return true;
	}
}
