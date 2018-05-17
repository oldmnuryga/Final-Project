package map;

import leaders.Leader;

public abstract class Tile {
	protected int terrainID;
	protected int movesRequired;
	protected double productionBase;
	protected double productionPotential;
	protected double foodBase;
	protected double foodPotential;
	protected double goldBase;
	protected double goldPotential;
	protected boolean crossable;
	protected Leader owner;
}
