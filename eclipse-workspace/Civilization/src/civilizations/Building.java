package civilizations;

import java.util.ArrayList;

import civilizations.buildings.*;

public abstract class Building extends Structure {
	protected int goldMaintenance;
	protected int goldSellPrice = productionRequirement;
	protected int goldPurchaseCost = productionRequirement * 3;
	protected int buildingID;
	public static ArrayList<Building> $allBuildings = new ArrayList<Building>();

	public abstract void uniqueAbility();

	public abstract void removeAbility();

	public int getGoldMaintenance() {
		return goldMaintenance;
	}

	public void setGoldMaintenance(int goldMaintenance) {
		this.goldMaintenance = goldMaintenance;
	}

	public int getGoldPurchaseCost() {
		return goldPurchaseCost;
	}

	public void setGoldPurchaseCost(int goldPurchaseCost) {
		this.goldPurchaseCost = goldPurchaseCost;
	}

	public int getGoldSellPrice() {
		return goldSellPrice;
	}

	public void setGoldSellPrice(int goldSellPrice) {
		this.goldSellPrice = goldSellPrice;
	}

	public int getBuildingID() {
		return buildingID;
	}

	public void setBuildingID(int buildingID) {
		this.buildingID = buildingID;
	}

	public boolean canBeBuilt() {
		if (techRequired < 0 || location.getOwner().hasTechnology(techRequired))
			return true;
		return false;
	}

	public static void instantiateBuildingArrayList() {
		$allBuildings.add(new Aqueduct());
		$allBuildings.add(new Bank());
		$allBuildings.add(new Barracks());
		$allBuildings.add(new Cathedral());
		$allBuildings.add(new Colosseum());
		$allBuildings.add(new Factory());
		$allBuildings.add(new Granary());
		$allBuildings.add(new HydroPlant());
		$allBuildings.add(new Library());
		$allBuildings.add(new ManufacturingPlant());
		$allBuildings.add(new Market());
		$allBuildings.add(new NuclearPlant());
		$allBuildings.add(new SpaceshipCockpit());
		$allBuildings.add(new SpaceshipEngine());
		$allBuildings.add(new SpaceshipFuselage());
		$allBuildings.add(new Temple());
		$allBuildings.add(new University());
		$allBuildings.add(new Walls());
	}

}
