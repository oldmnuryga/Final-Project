package leaders;

public class Poland extends Leader{
	// Casimir III
	// winged hussar (unit) replace lancer
	// +2 food from cathedral
	public Poland() {
		leaderName = "Casimir III";
		abbrevLeaderName = "The Polish";
		super.leaderID = 4;
	}
	public String getName() {
		return leaderName;
	}
}
