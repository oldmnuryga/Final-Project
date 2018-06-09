package civilizations;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import map.Tile;

public class City {
	protected String name;
	protected Player owner;
	protected static Tile location;
	protected boolean capital;
	protected boolean coastal;
	protected double goldProduced;
	protected double goldUsed;
	protected double productionRate;
	protected double productionExcess;
	protected double foodRate;
	protected double foodBox;
	protected double foodCap;
	protected static double scienceRate;
	protected double defenseRating;
	protected int citizens;
	protected int citizenCap;
	protected ArrayList<Tile> $cityTiles;
	protected ArrayList<Building> $buildings;
	protected ArrayList<Wonder> $wonders;
	protected static ImageIcon cityImageIcon;

	public City(Player player, Tile cityLocation) {
		owner = player;
		name = owner.getLeader().getCityNames().get(owner.getNumCities());
		capital = isCapital();
		coastal = isCoastal();
		location = cityLocation;
		goldProduced = 0;
		goldUsed = 0;
		productionRate = 0;
		productionExcess = 0;
		foodRate = 0;
		foodBox = 0;
		foodCap = 0;
		scienceRate = 0;
		citizens = 1;
		citizenCap = 10;
		$cityTiles = new ArrayList<Tile>();
		$buildings = new ArrayList<Building>();
		$wonders = new ArrayList<Wonder>();
		if (owner.getLeader().getLeaderID() == 0)
			cityImageIcon = new ImageIcon(
					City.class.getClassLoader().getResource("improvement/resources/americaCity.pdf"));
		if (owner.getLeader().getLeaderID() == 1)
			cityImageIcon = new ImageIcon(
					City.class.getClassLoader().getResource("improvement/resources/italyCity.pdf"));
		if (owner.getLeader().getLeaderID() == 2)
			cityImageIcon = new ImageIcon(
					City.class.getClassLoader().getResource("improvement/resources/koreaCity.pdf"));
		if (owner.getLeader().getLeaderID() == 3)
			cityImageIcon = new ImageIcon(
					City.class.getClassLoader().getResource("improvement/resources/mongoliaCity.pdf"));
		if (owner.getLeader().getLeaderID() == 4)
			cityImageIcon = new ImageIcon(
					City.class.getClassLoader().getResource("improvement/resources/polandCity.pdf"));
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

	public static double getScienceRate() {
		return scienceRate;
	}

	public static void setScienceRate(double scienceRate) {
		City.scienceRate = scienceRate;
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

	public void setGoldUsed(double goldUsed) {
		this.goldUsed = goldUsed;
	}

	public void setGoldProduced(double goldProduced) {
		this.goldProduced = goldProduced;
	}

	public boolean isCapital() {
		if (owner.getNumCities() == 0)
			return true;
		return false;
	}

	public boolean isCoastal() {
		return false;
	}

	protected void buildBuilding(Building e) {
		$buildings.add(e);
		e.setBuilt(true);
		e.uniqueAbility();
		setGoldUsed(getGoldUsed() + e.getGoldMaintenance());
	}

	protected void buyBuilding(Building e) {
		getOwner().setGoldReserve(getOwner().getGoldReserve() - e.getGoldPurchaseCost());
		$buildings.add(e);
		e.setBuilt(true);
		e.uniqueAbility();
		setGoldUsed(getGoldUsed() + e.getGoldMaintenance());
	}

	public boolean hasBuilding(int buildingID) {
		for (int i = 0; i < $buildings.size(); i++)
			if ($buildings.get(i).getBuildingID() == buildingID)
				return true;
		return false;
	}

	protected void removeBuilding(Building e) {
		setGoldUsed(getGoldUsed() - e.getGoldMaintenance());
		e.removeAbility();
		e.setBuilt(false);
		$buildings.remove(e);
	}

	protected void sellBuilding(Building e) {
		this.setGoldUsed(this.getGoldUsed() - e.getGoldMaintenance());
		e.removeAbility();
		e.setBuilt(false);
		$buildings.remove(e);
		getOwner().setGoldReserve(getOwner().getGoldReserve() + e.getGoldSellPrice());
	}

	public ImageIcon getCityImageIcon() {
		return cityImageIcon;
	}

	public void setCityImageIcon(ImageIcon cityImageIcon) {
		City.cityImageIcon = cityImageIcon;
	}

	public static void setCityGUI() {
		Tile.get$map()[location.get$location()[0]][location.get$location()[1]].setTileImageIcon(cityImageIcon);
	}

	protected void buildWonder(Wonder e) {
		$wonders.add(e);
		e.setBuilt(true);

	}

	public boolean hasWonder(int wonderID) {
		for (int i = 0; i < $wonders.size(); i++)
			if ($wonders.get(i).getWonderID() == wonderID)
				if (!(owner.hasTechnology($wonders.get(i).getTechObsoletionID())))
					return true;
		return false;
	}

}