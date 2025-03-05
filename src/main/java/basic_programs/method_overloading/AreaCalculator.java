package basic_programs.method_overloading;

public class AreaCalculator {
	public static double area(double radius) {
		if (radius < 0) {
			return -1;
		} else {
			return Math.PI * 2 * radius;
		}
	}
	
	public static double area(double length, double width) {
		if (length < 0 || width < 0) {
			return -1;
		} else
			return length * width;
	}
	
	public static void main(String[] args) {
	System.out.println("Area of circle :" + area(5.0));
		System.out.println("Area of circle :" + area(-1));
		System.out.println("Area of rectangle :" + area(5.0, 4.0));
		System.out.println("Area of rectangle :" + area(-1.0, 4.0));
	}
}

