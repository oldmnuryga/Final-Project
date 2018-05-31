package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Cathedral extends Building {
	private int addedHappiness;

	public Cathedral(City city) {
		buildingID = 3;
		location = city;
		name = "Cathedral";
		description = "+4 Happiness.";
		productionRequirement = 160;
		goldMaintenance = 3;
		techRequired = 34;
		addedHappiness = 4;
		isBuilt = false;
	}

	public int getAddedHappiness() {
		return addedHappiness;
	}

	public void setAddedHappiness(int addedHappiness) {
		this.addedHappiness = addedHappiness;
	}

	public void uniqueAbility() {
		location.getOwner().setHappiness(location.getOwner().getHappiness() + addedHappiness);
	}
}
