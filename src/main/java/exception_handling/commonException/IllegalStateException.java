package exception_handling.commonException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IllegalStateException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al = new ArrayList();
		al.add("Sachin");
		al.add("Rahul");
		al.add("saurav");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			itr.remove();
		}
	}
}
