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
		addedHappiness = (int) decideHappiness();
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

	public void removeAbility() {
		location.getOwner().setHappiness(location.getOwner().getHappiness() - addedHappiness);

	}

	public double decideHappiness() {
		double happiness = 4.0;
		if (location.getOwner().hasWonder(13))
			happiness = 6.0;
		return happiness;
	}
}
