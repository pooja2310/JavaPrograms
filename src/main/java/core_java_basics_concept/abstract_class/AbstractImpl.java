package core_java_basics_concept.abstract_class;

public class AbstractImpl extends MyAbstract {
	
	public static void main(String[] args) {
		// MyAbstract myAbstract = new MyAbstract();
		AbstractImpl abs = new AbstractImpl();
		abs.display();
		abs.print();
		abs.sing();
	}
	
	@Override
	public void display() {
		//System.out.println("Hello, now I have a body as well as a soul!");
	}
}
