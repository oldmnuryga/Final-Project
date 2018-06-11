package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Bank extends Building {
	private double addedGold;

	public Bank(City city) {
		buildingID = 1;
		location = city;
		name = "Bank";
		description = "Taxes and Luxuries increase by 50%. Requires a market.";
		productionRequirement = 120;
		goldMaintenance = 3;
		techRequired = 26;
		addedGold = location.getGoldProduced() * 0.5;
	}

	public Bank() {
		buildingID = 1;
		name = "Bank";
		description = "Taxes and Luxuries increase by 50%. Requires a market.";
		productionRequirement = 120;
		goldMaintenance = 3;
		techRequired = 26;
	//	addedGold = location.getGoldProduced() * 0.5;
	}

	public double getAddedGold() {
		return addedGold;
	}

	public void setAddedGold(double addedGold) {
		this.addedGold = addedGold;
	}

	public void uniqueAbility() {
		location.setGoldProduced(location.getGoldProduced() + addedGold);
	}

	public boolean canBeBuilt() {
		if (location.getOwner().hasTechnology(techRequired) && location.hasBuilding(10))
			return true;
		return false;
	}

	public void removeAbility() {
		location.setGoldProduced(location.getGoldProduced() - addedGold);
	}
}
