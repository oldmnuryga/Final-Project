package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Library extends Building {
	private double addedScience;

	public Library(City city) {
		buildingID = 8;
		location = city;
		name = "Library";
		description = "Science +50%.";
		productionRequirement = 80;
		goldMaintenance = 1;
		techRequired = 11;
		addedScience = location.getScienceRate() * 0.5;
		isBuilt = false;
	}

	public double getAddedScience() {
		return addedScience;
	}

	public void setAddedScience(double addedScience) {
		this.addedScience = addedScience;
	}

	public void uniqueAbility() {
		location.setScienceRate(location.getScienceRate() + addedScience);
	}
}
