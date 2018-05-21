package civilizations;

import java.util.ArrayList;

import map.Tile;

public class City {
	protected String name;
	protected int size;
	protected Player owner;
	protected boolean capital;
	protected boolean coastal;
	protected double goldRate;
	protected double productionRate;
	protected double productionExcess;
	protected double foodRate;
	protected double foodBox;
	protected double foodCap;
	protected double scienceRate;
	protected int citizens;
	protected int citizenCap;
	protected ArrayList <Tile> $cityTiles;
	protected ArrayList <Structure> $structures;
	protected City() { 
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Player getOwner() {
		return owner;
	}
	public void setOwner(Player owner) {
		this.owner = owner;
	}
	public boolean isCapital() {
		return capital;
	}
	public void setCapital(boolean capital) {
		this.capital = capital;
	}
	public boolean isCoastal() {
		return coastal;
	}
	public void setCoastal(boolean coastal) {
		this.coastal = coastal;
	}
	public double getGoldRate() {
		return goldRate;
	}
	public void setGoldRate(double goldRate) {
		this.goldRate = goldRate;
	}
	public double getProductionRate() {
		return productionRate;
	}
	public void setProductionRate(double productionRate) {
		this.productionRate = productionRate;
	}
	public double getProductionExcess() {
		return productionExcess;
	}
	public void setProductionExcess(double productionExcess) {
		this.productionExcess = productionExcess;
	}
	public double getFoodRate() {
		return foodRate;
	}
	public void setFoodRate(double foodRate) {
		this.foodRate = foodRate;
	}
	public double getFoodBox() {
		return foodBox;
	}
	public void setFoodBox(double foodBox) {
		this.foodBox = foodBox;
	}
	public double getFoodCap() {
		return foodCap;
	}
	public void setFoodCap(double foodCap) {
		this.foodCap = foodCap;
	}
	public double getScienceRate() {
		return scienceRate;
	}
	public void setScienceRate(double scienceRate) {
		this.scienceRate = scienceRate;
	}
	public int getCitizens() {
		return citizens;
	}
	public void setCitizens(int citizens) {
		this.citizens = citizens;
	}
	public ArrayList<Tile> get$cityTiles() {
		return $cityTiles;
	}
	public void set$cityTiles(ArrayList<Tile> $cityTiles) {
		this.$cityTiles = $cityTiles;
	}
	public ArrayList<Structure> get$structures() {
		return $structures;
	}
	public void set$structures(ArrayList<Structure> $structures) {
		this.$structures = $structures;
	}
	public int getCitizenCap() {
		return citizenCap;
	}
	public void setCitizenCap(int num) {
		this.citizenCap = num;
	}
	
}