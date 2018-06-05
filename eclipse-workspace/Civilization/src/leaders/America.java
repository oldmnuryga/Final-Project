package leaders;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

public class America extends Leader {
	// george washington
	// all land units have +1 movement
	// +2 gpt
	public America() {
		leaderName = "George Washington";
		abbrevLeaderName = "The Americans";
		super.leaderID = 0;
		color = Color.BLUE;
		cityNames = new ArrayList<String>(
				Arrays.asList("Washington", "New York", "Boston", "Philadelphia", "Atlanta", "Chicago"));

	}
}
