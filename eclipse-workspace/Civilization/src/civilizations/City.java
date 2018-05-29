package civilizations;

import java.util.ArrayList;

import map.Tile;

public class City {
	protected String name;
	protected Player owner;
	protected Tile location;
	protected boolean capital;
	protected boolean coastal;
	protected double goldRate;
	protected double productionRate;
	protected double productionExcess;
	protected double foodRate;
	protected double foodBox;
	protected double foodCap;
	protected double scienceRate;
	protected double defenseRating;
	protected int citizens;
	protected int citizenCap;
	protected ArrayList<Tile> $cityTiles;
	protected ArrayList<Structure> $structures;

	protected City(Player player) {
		owner = player;
		name = owner.getLeader().getCityNames().get(owner.getNumCities());
		capital = isCapital();
		coastal = isCoastal();
		// location =
		goldRate = 0;
		productionRate = 0;
		productionExcess = 0;
		foodRate = 0;
		foodBox = 0;
		foodCap = 0;
		scienceRate = 0;
		citizens = 1;
		citizenCap = 10;
		$cityTiles = new ArrayList<Tile>();
		$structures = new ArrayList<Structure>();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public boolean getCapital() {
		return capital;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	public boolean getCoastal() {
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

	public Tile getLocation() {
		return location;
	}

	public void setLocation(Tile location) {
		this.location = location;
	}

	public double getDefenseRating() {
		return defenseRating;
	}

	public void setDefenseRating(double defenseRating) {
		this.defenseRating = defenseRating;
	}

	public boolean isCapital() {
		if (owner.getNumCities() == 0)
			return true;
		return false;
	}

	public boolean isCoastal() {
		return false;
	}

}