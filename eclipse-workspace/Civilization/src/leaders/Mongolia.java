package leaders;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

public class Mongolia extends Leader {
	// Genghis Khan
	// military strength +10%
	// +20 hit points per unit
	public Mongolia() {
		leaderName = "Genghis Khan";
		abbrevLeaderName = "The Mongols";
		super.leaderID = 3;
		color = Color.ORANGE;
		cityNames = new ArrayList<String>(
				Arrays.asList("Karakorum", "Beshbalik", "Turfan", "Hsia", "Old Sarai", "New Sarai"));

	}
}
