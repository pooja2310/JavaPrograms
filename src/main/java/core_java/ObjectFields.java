package core_java;

public class ObjectFields {
	public static void main(String[] args)
	{
		Office ofc= new Office();
		Office ofc2=new Office();
		ofc.setName("Pooja");
		ofc2.setName("Aniket");
		ofc2.printData();
		ofc.printData();
	}


}
class Office {
	private String name;
	int age;

	Office() {
		age = 22;
	}

	public void setName(String newName) {
		this.name = newName;

	}

	public void printData() {
		System.out.println("name :" + name   +  " age :" + age);
	}
}





