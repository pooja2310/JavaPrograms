package collections.comparable;

import lombok.Data;

@Data
public class Player implements Comparable<Player>{
	private int age;
	private String name;
	
	public Player(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	// this logic to get data in Ascending order using comparable
	
	@Override
	public int compareTo(Player otherPlayer) {
		if(this.age > otherPlayer.age)
			return 1;
		else if (this.age< otherPlayer.age)
			return -1;
		else return 0;
	}
}
