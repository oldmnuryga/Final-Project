package leaders;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

public class Poland extends Leader {
	// Casimir III
	// winged hussar (unit) replace lancer
	// +2 food from cathedral
	public Poland() {
		leaderName = "Casimir III";
		abbrevLeaderName = "The Polish";
		super.leaderID = 4;
		color = Color.RED;
		cityNames = new ArrayList<String>(Arrays.asList("Warsaw", "Krakow", "Lodz", "Wroclaw", "Poznan", "Gdansk"));

	}
}
