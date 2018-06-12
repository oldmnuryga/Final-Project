package improvements;

public class TradingPost {
	protected int goldMaintenance;
	protected int timeToBuild;
	protected int goldBase;
	protected int goldPotential;
	protected int scienceBase;
	protected int sciencePotential;
	
	//all improvements would be built by the worker, if said worker existed in the game
	//provides more gold per turn

	public TradingPost() {
		goldMaintenance = 1;
		timeToBuild = 4;
		goldBase = 3;
		goldPotential = 5;
		scienceBase = 0;
		sciencePotential = 2;
	}
}
