package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Temple extends Building {
	private double addedHappiness;

	public Temple(City city) {
		buildingID = 12;
		location = city;
		name = "Nuclear Plant.";
		description = "Production +50%.";
		productionRequirement = 160;
		goldMaintenance = 2;
		techRequired = 65;
		addedHappiness = decideHappiness();
		isBuilt = false;
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
		//TODO check for if Oracle is built
		return happiness;
	}
	public void uniqueAbility() {
		location.getOwner().setHappiness(location.getOwner().getHappiness() + addedHappiness);
	}
}
