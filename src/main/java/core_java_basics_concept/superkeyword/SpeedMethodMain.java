package core_java_basics_concept.superkeyword;

public class SpeedMethodMain extends SpeedParent {
	public void display() {
		int speed = 200;
		System.out.println("Speed from child class :" + speed);
	}
	
	public void message() {
		display();
		super.display();  //it is coming from speed parent class
	}
	
	public static void main(String[] args) {
		SpeedMethodMain s = new SpeedMethodMain();
		s.message();
	}
}
