package core_java_basics;

public class CopyConstructerMain {
	public static void main(String[] args) {
		CopyConstructor cp1 = new CopyConstructor("POLO", 99);
		System.out.println(cp1);
		CopyConstructor cp2 = new CopyConstructor(cp1);
		System.out.println(cp2);
	}
}
