package leaders;


public class Mongolia extends Leader {
	// Genghis Khan
	// military strength +10%
	// +20 hit points per unit
	public Mongolia() {
		super.leaderName = "Genghis Khan";
		super.abbrevLeaderName = "The Mongols";
	}
	public String getName() {
		return leaderName;
	}
}
