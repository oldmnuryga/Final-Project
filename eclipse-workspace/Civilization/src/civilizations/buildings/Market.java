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
		addedGold = location.getGoldProduced() * 0.5;
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

	public void removeAbility() {
		location.setGoldProduced(location.getGoldProduced() - addedGold);

	}
}
