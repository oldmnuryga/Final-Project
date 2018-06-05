package leaders;

public class Korea extends Leader {
	// Sejong
	// +10% science
	// +1 science from universities
	public Korea() {
		leaderName = "Sejong";
		abbrevLeaderName = "The Koreans";
		super.leaderID = 2;
	}

	public String getName() {
		return leaderName;
	}
}
