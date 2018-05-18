package map;

import leaders.Leader;

public class GrassTile extends Tile{	
	public GrassTile(int tterrainID, int tmovesRequired, double tproductionBase, double tproductionPotential, double tfoodBase,
			double tfoodPotential, double tgoldBase, double tgoldPotential, boolean tcrossable, boolean toccupied, Leader towner) {
		super.terrainID = tterrainID;
		super.movesRequired = tmovesRequired;
		super.productionBase = tproductionBase;
		super.productionPotential = tproductionPotential;
		super.foodBase = tfoodBase;
		super.foodPotential = tfoodPotential;
		super.goldBase = tgoldBase;
		super.goldPotential = tgoldPotential;
		super.crossable = tcrossable;
		super.occupied = toccupied;
		super.owner = towner;
	}
}
