package improvements;

public class Lumbermill {
	protected int goldMaintenance;
	protected int timeToBuild;
	protected int productionBase;
	protected int productionPotential;

	//all improvements would be built by the worker, if said worker existed in the game
	//needs to be built on the forest tile
	//increases production of a city
	
	public Lumbermill() {
		goldMaintenance = 2;
		timeToBuild = 4;
		productionBase = 2;
		productionPotential = 3;
	}
}
