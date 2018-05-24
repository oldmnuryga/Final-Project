package map;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import leaders.Leader;

public abstract class Tile {
	protected final static int MAP_SIZE = 100;
	protected final static int TEXTURE_SIZE = 45;
	protected final static int GENERATION_ITERATIONS = 10;
	protected final static int GENERATION_SIZE_MULTIPLIER = 4;
	protected int terrainID; //0 - water, 1 - grassTile, 2 - sandTile, 3 - MountainTile, 4- Forest
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
	protected ImageIcon tileImageIcon;
	protected JLabel tileLabel;
	protected static Tile[][] $map = new Tile[MAP_SIZE][MAP_SIZE];
	
	public static void generateMap() {
		Random rand = new Random();
		for (int i = 0; i < $map.length; i++) {
			for (int j = 0; j < $map[i].length; j++) {
				//$map[i][j] = new WaterTile();
				int temp = rand.nextInt(5);
				if(temp == 0)
					$map[i][j] = new WaterTile();
				if(temp == 1)
					$map[i][j] = new GrassTile();
				if(temp == 2)
					$map[i][j] = new SandTile();
				if(temp == 3)
					$map[i][j] = new MountainTile();
				if(temp == 4)
					$map[i][j] = new ForestTile();
				int[] $tempLocation = {i, j};
				$map[i][j].set$location($tempLocation);
			} 
			int[][] $genArray = new int[MAP_SIZE][MAP_SIZE];
			for(int iterations = 0; iterations < GENERATION_ITERATIONS; iterations++){
				int tempX = rand.nextInt(95);
				int tempY = rand.nextInt(95);
				int genType = rand.nextInt(6);
				if(genType == 0){
					$genArray[tempX][tempY] = GENERATION_SIZE_MULTIPLIER;
					$genArray[tempX-1][tempY-1] = GENERATION_SIZE_MULTIPLIER;
					$genArray[tempX-2][tempY-2] = GENERATION_SIZE_MULTIPLIER;
				}
				if(genType == 1){
					$genArray[tempX][tempY] = GENERATION_SIZE_MULTIPLIER;
					$genArray[tempX+1][tempY+1] = GENERATION_SIZE_MULTIPLIER;
					$genArray[tempX+2][tempY+2] = GENERATION_SIZE_MULTIPLIER;
				}
				if(genType == 2){
					$genArray[tempX][tempY] = GENERATION_SIZE_MULTIPLIER;
					$genArray[tempX-1][tempY-1] = GENERATION_SIZE_MULTIPLIER;
					$genArray[tempX+1][tempY+1] = GENERATION_SIZE_MULTIPLIER;
				}
				if(genType == 3){
					$genArray[tempX][tempY] = GENERATION_SIZE_MULTIPLIER;
					$genArray[tempX+1][tempY-1] = GENERATION_SIZE_MULTIPLIER;
					$genArray[tempX-1][tempY+1] = GENERATION_SIZE_MULTIPLIER;
				}
				if(genType == 4){
					$genArray[tempX][tempY] = GENERATION_SIZE_MULTIPLIER;
					$genArray[tempX-1][tempY-1] = GENERATION_SIZE_MULTIPLIER;
					$genArray[tempX-2][tempY-2] = GENERATION_SIZE_MULTIPLIER;
					$genArray[tempX-3][tempY-3] = GENERATION_SIZE_MULTIPLIER;
				}
				if(genType == 5){
					$genArray[tempX][tempY] = GENERATION_SIZE_MULTIPLIER;
					$genArray[tempX+1][tempY+1] = GENERATION_SIZE_MULTIPLIER;
					$genArray[tempX+2][tempY+2] = GENERATION_SIZE_MULTIPLIER;
					$genArray[tempX+3][tempY+3] = GENERATION_SIZE_MULTIPLIER;
				}
			}
			for(int h = 0; h < $map.length; h++)
				for(int j = 0; j < $map.length; j++){
					if($genArray[h][j] == 0)
						$map[h][j] = new WaterTile();
					else if($genArray[h][j] == GENERATION_SIZE_MULTIPLIER)
						$map[h][j] = new MountainTile();
					else
						$map[h][j] = new GrassTile();
					int[] $tempLocation = {h, j};
					$map[h][j].set$location($tempLocation);
				}
			
		}
		
		$map[1][1] = new GrassTile();
		$map[1][2] = new GrassTile();
		$map[2][1] = new GrassTile();
		$map[2][2] = new GrassTile();
		$map[3][3] = new SandTile();
		$map[4][4] = new MountainTile();
		$map[5][5] = new ForestTile();
	}
	
	//GETTERS AND SETTERS
	
	public int getTerrainID() {
		return terrainID;
	}
	
	public static int getTEXTURE_SIZE() {
		return TEXTURE_SIZE;
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

	public ImageIcon getTileImageIcon() {
		return tileImageIcon;
	}

	public void setTileImageIcon(ImageIcon tileImageIcon) {
		this.tileImageIcon = tileImageIcon;
	}

	public void setTileLabel(JLabel tileLabel) {
		this.tileLabel = tileLabel;
	}

	public void set$location(int[] $location) {
		this.$location = $location;
	}

	public static Tile[][] get$map() {
		return $map;
	}

	public void set$map(Tile[][] $map) {
		Tile.$map = $map;
	}
	
	//public TIle getTileFromID(int ID){
	//	if(ID = 0
	//	   return GrassTile;
	//}
}
