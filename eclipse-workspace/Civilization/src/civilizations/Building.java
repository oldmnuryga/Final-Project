package civilizations;
//ABSTRACT CLASS FOR BUILDINGS - HELPS WITH ORGANIZING CODE, USED TO EASILY SET UP DIFFERENT BUILDINGS WITH DIFFERENT ABILITIES - CONTAINS PARAMETERS, METHODS, AND GETTERS AND SETTERS

import java.util.ArrayList;

import civilizations.buildings.*;

public abstract class Building extends Structure {
	protected int goldMaintenance; // how much gold per turn it takes to keep the building
	protected int goldSellPrice = productionRequirement; // how much you can sell the building for
	protected int goldPurchaseCost = productionRequirement * 3; // how much it costs to make the building in gold
	protected int buildingID; // ID, different per building
	public static ArrayList<Building> $allBuildings = new ArrayList<Building>(); // Array List of all the buildings

	public abstract void uniqueAbility(); // different per building, each one is different from one another

	public abstract void removeAbility(); // removes the building

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

	public static ArrayList<Building> get$allBuildings() {
		return $allBuildings;
	}

	public static void set$allBuildings(ArrayList<Building> $allBuildings) {
		Building.$allBuildings = $allBuildings;
	}

	public void setBuildingID(int buildingID) {
		this.buildingID = buildingID;
	}

	// CHECKS IF A BUILDING CAN BE BUILT
	public boolean canBeBuilt() {
		if (techRequired < 0 || location.getOwner().hasTechnology(techRequired))
			return true;
		return false;
	}

	// CREATES AN ARRAY CONTAINING EVERY KIND OF BUILDING TO USE AS REFERENCE
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
