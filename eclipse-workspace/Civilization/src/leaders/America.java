package leaders;

public class America extends Leader {
	// george washington
	// all land units have +1 movement
	// +2 gpt
	public America() {
		super.leaderName = "George Washington";
		super.abbrevLeaderName = "The Americans";
	}
	public String getName() {
		return leaderName;
	}
}
