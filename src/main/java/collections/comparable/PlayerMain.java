package collections.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayerMain
{
	public static void main(String[] args) {
		Player player1 = new Player(40, "Ronaldo");
		Player player2 = new Player(37, "Messi");
		Player player3 = new Player(36, "Neymar");
		Player player4 = new Player(45, "Rooney");
		
		List<Player> playersList = Arrays.asList(player1, player2, player4, player3);
		
		for(Player player : playersList)
		System.out.println("Before sorting : " + player);
		
		Collections.sort(playersList);
		for(Player player : playersList)
		System.out.println("After sorting : " + player);
		
	}
	
	
}
