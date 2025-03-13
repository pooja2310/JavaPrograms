package exception_handling.commonException;

public class ArrayIndexOutOfBoundException {
	public static void main(String[] args) {
		int a[] = {1, 3, 5, 4};
		int l = a.length;
		System.out.println("Length : " + l);
		System.out.println(a[5]);
	}
}
