package leaders;

public class Italy extends Leader {
	// mussolini
	// +2 food
	// +1 production

	public Italy() {
		leaderName = "Mussolini";
		abbrevLeaderName = "The Italians";
		super.leaderID = 1;
	}

	public String getName() {
		return leaderName;
	}
}
