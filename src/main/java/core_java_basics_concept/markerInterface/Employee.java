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
			
			/* In java serialization is way used to convert an object into a byte stream which can be transported to any other
			running JVM through a network. To make a java class Serializable implements java.io.Serializable interface.
			JVM will take care of serializing objects. Serializable interface is a marker interface.
			A marker interface doesn’t have any method i.e. Serializable interface doesn’t have any method,
			it gives indication to compiler that use Java Serialization mechanism to serialize this object.*/
			
			//Create the object of Employee class
			
			Employee s1 = new Employee(27, "Eddie");
			
			//Write the object to the stream by creating a output stream
			FileOutputStream fout = new FileOutputStream("Eddie.txt");  // allow a file to be opened for writing by only one FileOutputStream
			ObjectOutputStream out = new ObjectOutputStream(fout);// An ObjectOutputStream writes primitive data types and graphs of Java objects to an OutputStream.
			out.writeObject(s1);    //serialization
			out.flush();
			//close the stream
			out.close();
			System.out.println("Object successfully written to the file");
			//Create a stream to read the object
			
			/*
			Deserialization is the reverse process of serialization. It is the process of rebuilding object from serialized state.
			 */
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Eddie.txt")); //Creates a FileInputStream by opening a connection to an actual file, the file named by the path name name in the file system
			Employee s = (Employee) in.readObject();  //Deserialization- downCasting(superclass to subclass)
			//An ObjectInputStream deserializes primitive data and objects previously written using an ObjectOutputStream.
			//print the data of the deserialized object
			System.out.println("Employee object: " + s.id + " " + s.name);
			//close the stream
			in.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}