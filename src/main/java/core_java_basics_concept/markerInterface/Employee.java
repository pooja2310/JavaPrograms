package core_java_basics_concept.markerInterface;

import java.io.*;

class Employee implements Serializable {
	transient int id;  //id variable is transient it means we dont want to serialize it.
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Main {
	public static void main(String args[]) {
		try {
			//Create the object of Employee class
			Employee s1 = new Employee(27, "Eddie");
			//Write the object to the stream by creating a output stream
			FileOutputStream fout = new FileOutputStream("Eddie.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);    //serialization
			out.flush();
			//close the stream
			out.close();
			System.out.println("Object successfully written to the file");
//Create a stream to read the object
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Eddie.txt"));
			Employee s = (Employee) in.readObject();  //Deserialization
			//print the data of the deserialized object
			System.out.println("Employee object: " + s.id + " " + s.name);
			//close the stream
			in.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}