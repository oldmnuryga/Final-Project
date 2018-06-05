package leaders;

public class Mongolia extends Leader {
	// Genghis Khan
	// military strength +10%
	// +20 hit points per unit
	public Mongolia() {
		leaderName = "Genghis Khan";
		abbrevLeaderName = "The Mongols";
		super.leaderID = 3;
	}

	public String getName() {
		return leaderName;
	}
}
