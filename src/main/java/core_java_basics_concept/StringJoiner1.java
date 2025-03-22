package core_java_basics_concept;

import java.util.StringJoiner;

public class StringJoiner1 {
	public static void main(String[] args) {
		StringJoiner strJoiner = new StringJoiner(",", "[", "]");
		strJoiner.add("Green");
		strJoiner.add("Blue");
		strJoiner.add("black");
		System.out.println(strJoiner);
	}
}
