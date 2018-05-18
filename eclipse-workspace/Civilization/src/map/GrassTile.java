package map;

public class GrassTile extends Tile{	
	public GrassTile() {
		super.terrainID = 1;
		super.movesRequired = 1;
		super.productionBase = 1.0;
		super.productionPotential = 3.0;
		super.foodBase = 1.0;
		super.foodPotential = 2.0;
		super.goldBase = 1.0;
		super.goldPotential = 2.0;
		super.crossable = true;
		super.occupied = false;
		super.improved = false;
		super.owner = null;
	}
}
