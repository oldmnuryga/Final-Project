package leaders;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

public class Korea extends Leader {
	// Sejong
	// +10% science
	// +1 science from universities
	public Korea() {
		civName = "Korea";
		leaderName = "Sejong";
		abbrevLeaderName = "The Koreans";
		super.leaderID = 2;
		color = Color.YELLOW;
		cityNames = new ArrayList<String>(Arrays.asList("Seoul", "Busan", "Pyongyang", "Jeonju", "Daegu", "Kaesong"));
	}
}
