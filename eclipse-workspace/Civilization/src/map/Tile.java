package map;

import java.util.Random;

import javax.swing.JLabel;

import leaders.Leader;

public abstract class Tile {
	protected final static int MAP_SIZE = 50;
	protected int terrainID; //0 - water, 1 - grassTile, 2 - sandTile, 3 - MountainTile
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
	protected int[] $location = new int[2];
	protected JLabel tileLabel;
	protected Tile[][] $map = new Tile[MAP_SIZE][MAP_SIZE];
	
	public void generateMap() {
		Random rand = new Random();
		for (int i = 0; i < $map.length; i++) {
			for (int j = 0; j < $map[i].length; j++) {
				$map[i][j] = new WaterTile();
				int[] $tempLocation = {i, j};
				$map[i][j].set$location($tempLocation);
			}
		}
		
		$map[1][1] = new GrassTile();
		$map[1][2] = new GrassTile();
		$map[2][1] = new GrassTile();
		$map[2][2] = new GrassTile();
	}
	
	//GETTERS AND SETTERS
	
	public int getTerrainID() {
		return terrainID;
	}
	
	public static int getMAP_SIZE() {
		return MAP_SIZE;
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

	public int[] get$location() {
		return $location;
	}
	
	public JLabel getTileLabel() {
		return tileLabel;
	}

	public void setTileLabel(JLabel tileLabel) {
		this.tileLabel = tileLabel;
	}

	public void set$location(int[] $location) {
		this.$location = $location;
	}

	public Tile[][] get$map() {
		return $map;
	}

	public void set$map(Tile[][] $map) {
		this.$map = $map;
	}
}
