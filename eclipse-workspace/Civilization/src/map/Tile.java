package map;

import leaders.Leader;

public abstract class Tile {
	protected int terrainID; //0 - WaterTile, 1- GrassTile, 2 - SandTile
	protected int movesRequired;
	protected double productionBase;
	protected double productionPotential;
	protected double foodBase;
	protected double foodPotential;
	protected double goldBase;
	protected double goldPotential;
	protected boolean crossable;
	protected boolean occupied;
	protected boolean improved;
	protected Leader owner;
	
	//GETTERS AND SETTERS
	
	public int getTerrainID() {
		return terrainID;
	}
	
	public void setTerrainID(int terrainID) {
		this.terrainID = terrainID;
	}
	
	public int getMovesRequired() {
		return movesRequired;
	}
	
	public void setMovesRequired(int movesRequired) {
		this.movesRequired = movesRequired;
	}
	
	public double getProductionBase() {
		return productionBase;
	}
	
	public void setProductionBase(double productionBase) {
		this.productionBase = productionBase;
	}
	
	public double getProductionPotential() {
		return productionPotential;
	}
	
	public void setProductionPotential(double productionPotential) {
		this.productionPotential = productionPotential;
	}
	
	public double getFoodBase() {
		return foodBase;
	}
	
	public void setFoodBase(double foodBase) {
		this.foodBase = foodBase;
	}
	
	public double getFoodPotential() {
		return foodPotential;
	}
	
	public void setFoodPotential(double foodPotential) {
		this.foodPotential = foodPotential;
	}
	
	public double getGoldBase() {
		return goldBase;
	}
	
	public void setGoldBase(double goldBase) {
		this.goldBase = goldBase;
	}
	
	public double getGoldPotential() {
		return goldPotential;
	}
	
	public void setGoldPotential(double goldPotential) {
		this.goldPotential = goldPotential;
	}
	
	public boolean isCrossable() {
		return crossable;
	}
	
	public void setCrossable(boolean crossable) {
		this.crossable = crossable;
	}
	
	public boolean isOccupied() {
		return occupied;
	}
	
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
	public boolean isImproved() {
		return improved;
	}

	public void setImproved(boolean improved) {
		this.improved = improved;
	}

	public Leader getOwner() {
		return owner;
	}
	
	public void setOwner(Leader owner) {
		this.owner = owner;
	}
}
