package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class University extends Building {
	private double addedScience;

	public University(City city) {
		buildingID = 13;
		location = city;
		name = "University";
		description = "Science +50%.";
		productionRequirement = 160;
		goldMaintenance = 3;
		techRequired = 28;
		addedScience = location.getScienceRate() * 0.5;
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
}
