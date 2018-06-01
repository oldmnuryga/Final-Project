package leaders;

import java.util.ArrayList;

public abstract class Leader {
	protected String leaderName;
	protected int leaderID;
	protected String abbrevLeaderName;
	protected ArrayList <String> cityNames;
	public String getLeaderName() {
		return leaderName;
	}
	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}
	public String getAbbrevLeaderName() {
		return abbrevLeaderName;
	}
	public void setAbbrevLeaderName(String abbrevLeaderName) {
		this.abbrevLeaderName = abbrevLeaderName;
	}
	public ArrayList<String> getCityNames() {
		return cityNames;
	}
	public void setCityNames(ArrayList<String> cityNames) {
		this.cityNames = cityNames;
	}
	public int getLeaderID() {
		return leaderID;
	}
	public void setLeaderID(int leaderID) {
		this.leaderID = leaderID;
	}
}
