package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Market extends Building {
	private double addedGold;

	public Market(City city) {
		buildingID = 10;
		location = city;
		name = "Market";
		description = "Gold +50%.";
		productionRequirement = 80;
		goldMaintenance = 1;
		techRequired = 14;
		addedGold = location.getGoldRate() * 0.5;
		isBuilt = false;
	}

	public double getAddedGold() {
		return addedGold;
	}

	public void setAddedGold(double addedGold) {
		this.addedGold = addedGold;
	}

	public void uniqueAbility() {
		location.setGoldRate(location.getGoldRate() + addedGold);
	}
}
