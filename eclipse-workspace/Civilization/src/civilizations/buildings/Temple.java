package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Temple extends Building {
	private double addedHappiness;

	public Temple(City city) {
		buildingID = 12;
		location = city;
		name = "Temple";
		description = "Increases Happiness.";
		productionRequirement = 160;
		goldMaintenance = 2;
		techRequired = 65;
		addedHappiness = decideHappiness();
	}

	public Temple() {
		buildingID = 12;
		name = "Temple";
		description = "Increases Happiness.";
		productionRequirement = 160;
		goldMaintenance = 2;
		techRequired = 65;
		addedHappiness = decideHappiness();
	}

	public double getAddedHappiness() {
		return addedHappiness;
	}

	public void setAddedHappiness(double addedHappiness) {
		this.addedHappiness = addedHappiness;
	}

	public double decideHappiness() {
		double happiness = 1.0;
		if (location.getOwner().hasTechnology(8))
			happiness = 2.0;
		if (location.hasWonder(9))
			happiness *= 2.0;
		return happiness;
	}

	public void uniqueAbility() {
		location.getOwner().setHappiness(location.getOwner().getHappiness() + addedHappiness);
	}

	public void removeAbility() {
		location.getOwner().setHappiness(location.getOwner().getHappiness() - addedHappiness);

	}
}
