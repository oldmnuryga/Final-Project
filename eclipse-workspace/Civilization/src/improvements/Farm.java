package improvements;

import map.Tile;

public class Farm {
	protected int goldMaintenance;
	protected int timeToBuild;
	protected int foodBase;
	protected int foodPotential;
	protected Tile location;
	
	//all improvements would be built by the worker onto a tile, if said worker was implemented in the game
	// farms would provide food for the city

	public Farm() {
		goldMaintenance = 1;
		timeToBuild = 2;

	}
}
