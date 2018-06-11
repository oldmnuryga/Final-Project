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
		addedScience = decideScienceRate();
	}

	public Library() {
		buildingID = 8;
		name = "Library";
		description = "Science +50%.";
		productionRequirement = 80;
		goldMaintenance = 1;
		techRequired = 11;
		addedScience = decideScienceRate();
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

	public void removeAbility() {
		location.setScienceRate(location.getScienceRate() - addedScience);

	}

	public double decideScienceRate() {
		double scienceRate = location.getScienceRate() * 0.5;
		if (location.hasWonder(8))
			scienceRate *= 1.666;
		return scienceRate;
	}
}
