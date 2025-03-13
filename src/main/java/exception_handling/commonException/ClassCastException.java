package exception_handling.commonException;

public class ClassCastException {
		public static void main(String[] args)
		{
			try {
				
				// creating an object
				Object o = new Object();
				
				// type casting the object o to string which
				// give the class casted exception because we
				// type cast an parent type to its child type.
				String s = (String)o;
				
				System.out.println(s);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
