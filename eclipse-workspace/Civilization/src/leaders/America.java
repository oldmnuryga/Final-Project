package leaders;

public class America extends Leader {
	// george washington
	// all land units have +1 movement
	// +2 gpt
	public America() {
		leaderName = "George Washington";
		abbrevLeaderName = "The Americans";
		super.leaderID = 0;
	}

	public String getName() {
		return leaderName;
	}
}
