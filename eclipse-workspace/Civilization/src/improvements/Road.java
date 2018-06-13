package improvements;

public class Road {
	protected final static int MOVEMENT_REDUCION = -3;
	protected int goldMaintenance;
	protected int timeToBuild;

//all improvements would be built by the worker onto a tile, if said worker was implemented in the game
	//increases mobility of the player
	
	public Road() {
		goldMaintenance = 1;
		timeToBuild = 2;
	}
}
