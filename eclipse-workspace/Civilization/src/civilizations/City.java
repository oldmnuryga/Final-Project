package civilizations;

//CLASS FOR CITY OBJECT - THIS CONTROLS GOLD, PRODUCTION, AND CITIZEN GROWTH, INCLUDES GETTERS AND SETTERS AND DIFFERENT METHODS
import java.util.ArrayList;

import javax.swing.ImageIcon;

import map.Tile;
import units.Unit;

public class City {
	protected String name; // name of the city, change from each leader
	protected Player owner;
	protected static Tile location;
	protected boolean capital; // would matter if mult. cities
	protected boolean coastal; // adds benefits to the city
	protected boolean researching;
	protected boolean producing;
	protected double goldTotal;
	protected double goldProduced;
	protected double goldUsed;
	protected double productionRate;
	protected double productionExcess;
	protected double productionTotal;
	protected double foodRate;
	protected double foodBox;
	protected double foodCap;
	protected double foodTotal;
	protected double scienceRate;
	protected double scienceTotal;
	protected double defenseRating;
	protected double happinessTotal;
	protected int citizens;
	protected int citizenCap;
	protected ArrayList<Tile> $cityTiles;
	protected ArrayList<Building> $buildings;
	protected ArrayList<Wonder> $wonders;
	protected ArrayList<Building> $potentialBuildings;
	protected ArrayList<Wonder> $potentialWonders;
	protected ArrayList<Unit> $potentialUnits;
	protected static ImageIcon cityImageIcon;

	public City(Player player, Tile cityLocation) {
		owner = player;
		name = owner.getLeader().getCityNames().get(owner.getNumCities());
		capital = isCapital();
		coastal = isCoastal();
		location = cityLocation;
		goldProduced = 0;
		goldUsed = 0;
		goldTotal = 0;
		productionRate = 5;
		productionExcess = 0;
		productionTotal = 0;
		foodRate = 0;
		foodBox = 0;
		foodCap = 0;
		foodTotal = 0;
		scienceRate = 0;
		scienceTotal = 0;
		citizens = 1;
		citizenCap = 10;
		happinessTotal = 0;
		$cityTiles = new ArrayList<Tile>();
		$buildings = new ArrayList<Building>();
		$wonders = new ArrayList<Wonder>();
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

	public double getGoldProduced() {
		return goldProduced;
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

	public int getCitizenCap() {
		return citizenCap;
	}

	public double getHappinessTotal() {
		return happinessTotal;
	}

	public void setHappinessTotal(double happinessTotal) {
		this.happinessTotal = happinessTotal;
	}

	public void setCitizenCap(int num) {
		this.citizenCap = num;
	}

	public Tile getLocation() {
		return location;
	}

	public void setLocation(Tile location) {
		City.location = location;
	}

	public double getDefenseRating() {
		return defenseRating;
	}

	public void setDefenseRating(double defenseRating) {
		this.defenseRating = defenseRating;
	}

	public ArrayList<Building> get$buildings() {
		return $buildings;
	}

	public void set$buildings(ArrayList<Building> $buildings) {
		this.$buildings = $buildings;
	}

	// RETURNS A BUILDING THAT THE PLAYER OWNS
	public Building getCertainBuilding(int buildingID) {
		for (int i = 0; i < $buildings.size(); i++) {
			if ($buildings.get(i).getBuildingID() == buildingID)
				return $buildings.get(i);
		}
		return null;
	}

	public ArrayList<Wonder> get$wonders() {
		return $wonders;
	}

	public void set$wonders(ArrayList<Wonder> $wonders) {
		this.$wonders = $wonders;
	}

	public double getGoldUsed() {
		return goldUsed;
	}

	public boolean isResearching() {
		return researching;
	}

	public void setResearching(boolean researching) {
		this.researching = researching;
	}

	public boolean isProducing() {
		return producing;
	}

	public void setProducing(boolean producing) {
		this.producing = producing;
	}

	public void setGoldUsed(double goldUsed) {
		this.goldUsed = goldUsed;
	}

	public void setGoldProduced(double goldProduced) {
		this.goldProduced = goldProduced;
	}

	// would help if >1 city
	public boolean isCapital() {
		if (owner.getNumCities() == 0)
			return true;
		return false;
	}

	public boolean isCoastal() {
		return false;
	}

	public double getGoldTotal() {
		return goldTotal;
	}

	public void setGoldTotal(double goldTotal) {
		this.goldTotal = goldTotal;
	}

	public double getProductionTotal() {
		return productionTotal;
	}

	public void setProductionTotal(double productionTotal) {
		this.productionTotal = productionTotal;
	}

	public double getFoodTotal() {
		return foodTotal;
	}

	public void setFoodTotal(double foodTotal) {
		this.foodTotal = foodTotal;
	}

	public double getScienceTotal() {
		return scienceTotal;
	}

	public void setScienceTotal(double scienceTotal) {
		this.scienceTotal = scienceTotal;
	}

	// ADDS A BUILDING THAT WAS BUILT THROUGH PRODUCTION
	public void buildBuilding(Building e) {
		$buildings.add(e);
		e.setBuilt(true);
		e.uniqueAbility();
		setGoldUsed(getGoldUsed() + e.getGoldMaintenance());
	}

	// ADDS A BUILDING THAT WAS BUILT THROUGH BUYING WITH GOLD
	public void buyBuilding(Building e) {
		getOwner().setGoldReserve(getOwner().getGoldReserve() - e.getGoldPurchaseCost());
		$buildings.add(e);
		e.setBuilt(true);
		e.uniqueAbility();
		setGoldUsed(getGoldUsed() + e.getGoldMaintenance());
	}

	// CHECKS IF CITY HAS A CERTAIN BUILDING
	public boolean hasBuilding(int buildingID) {
		for (int i = 0; i < $buildings.size(); i++)
			if ($buildings.get(i).getBuildingID() == buildingID)
				return true;
		return false;
	}

	// REMOVES A BUILDING FROM CITY
	public void removeBuilding(Building e) {
		setGoldUsed(getGoldUsed() - e.getGoldMaintenance());
		e.removeAbility();
		e.setBuilt(false);
		$buildings.remove(e);
	}

	// SELLS A BUILDING FROM THE CITY
	public void sellBuilding(Building e) {
		this.setGoldUsed(this.getGoldUsed() - e.getGoldMaintenance());
		e.removeAbility();
		e.setBuilt(false);
		$buildings.remove(e);
		getOwner().setGoldReserve(getOwner().getGoldReserve() + e.getGoldSellPrice());
	}

	// CHECKS TO SEE WHICH BUILDINGS CAN BE BUILT
	public void findPotentialBuildings() {
		this.get$potentialBuildings().clear();
		for (int i = 0; i < Building.get$allBuildings().size(); i++)
			if (Building.get$allBuildings().get(i).canBeBuilt())
				$potentialBuildings.add(Building.get$allBuildings().get(i));

	}

	// CHECKS TO SEE WHICH WONDERS CAN BE BUILT
	public void findPotentialWonders() {
		this.get$potentialWonders().clear();
		for (int i = 0; i < Wonder.get$allWonders().size(); i++)
			if (owner.hasTechnology(Wonder.get$allWonders().get(i).getTechRequired())
					&& !(owner.hasTechnology(Wonder.get$allWonders().get(i).getTechObsoletionID())))
				$potentialWonders.add(Wonder.get$allWonders().get(i));

	}

	// CHECKS TO SEE WHICH UNITS CAN BE BUILT
	public void findPotentialUnits() {
		this.get$potentialUnits().clear();
		for (int i = 0; i < Unit.get$allUnits().size(); i++)
			if (owner.hasTechnology(Unit.get$allUnits().get(i).getTechRequired()))
				$potentialUnits.add(Unit.get$allUnits().get(i));
	}

	public ImageIcon getCityImageIcon() {
		return cityImageIcon;
	}

	public void setCityImageIcon(ImageIcon cityImageIcon) {
		City.cityImageIcon = cityImageIcon;
	}

	public ArrayList<Building> get$potentialBuildings() {
		return $potentialBuildings;
	}

	public void set$potentialBuildings(ArrayList<Building> $potentialBuildings) {
		this.$potentialBuildings = $potentialBuildings;
	}

	public ArrayList<Wonder> get$potentialWonders() {
		return $potentialWonders;
	}

	public void set$potentialWonders(ArrayList<Wonder> $potentialWonders) {
		this.$potentialWonders = $potentialWonders;
	}

	public ArrayList<Unit> get$potentialUnits() {
		return $potentialUnits;
	}

	public void set$potentialUnits(ArrayList<Unit> $potentialUnits) {
		this.$potentialUnits = $potentialUnits;
	}

	// ADDS WONDER TO CITY
	protected void buildWonder(Wonder e) {
		$wonders.add(e);
		e.setBuilt(true);

	}

	// CHECKS IF CITY HAS A WONDER
	public boolean hasWonder(int wonderID) {
		for (int i = 0; i < $wonders.size(); i++)
			if ($wonders.get(i).getWonderID() == wonderID)
				if (!(owner.hasTechnology($wonders.get(i).getTechObsoletionID())))
					return true;
		return false;
	}

	// HELPER METHOD FOR DEALING WITH ARRAY VALUES AROUND A CERTAIN COORDINATE FOR
	// TILES
	public Tile instantiateTileValues(int x, int y) {
		Tile.get$map()[location.get$location()[0] + x][location.get$location()[1] + y].setOwner(owner);
		return Tile.get$map()[location.get$location()[0] + x][location.get$location()[1] + y];
	}

	// GROWS THE CITY BORDER
	public void expandCity(int city) {
		ArrayList<Tile> $tempArr = new ArrayList<Tile>();

		Tile.get$map()[location.get$location()[0]][location.get$location()[1]].setIsCity(true);

		for (int i = -2; i <= 2; i++) {
			for (int j = -2; j <= 2; j++) {
				$tempArr.add(instantiateTileValues(i, j));
			}
		}
		owner.get$cities().get(city).set$cityTiles($tempArr);
	}

	// GROWS THE CITY BORDER AGAIN
	public void expandCity2(int city) {
		ArrayList<Tile> $tempArr = new ArrayList<Tile>();

		Tile.get$map()[location.get$location()[0]][location.get$location()[1]].setIsCity(true);

		for (int i = -3; i <= 3; i++) {
			for (int j = -3; j <= 3; j++) {
				$tempArr.add(instantiateTileValues(i, j));
			}
		}
		owner.get$cities().get(city).set$cityTiles($tempArr);
	}
}