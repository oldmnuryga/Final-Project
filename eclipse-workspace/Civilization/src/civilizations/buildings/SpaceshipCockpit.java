package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class SpaceshipCockpit extends Building {
	public SpaceshipCockpit(City city) {
		buildingID = 15;
		location = city;
		name = "Spaceship Cockpit";
		description = "One of the three parts required for a science victory.";
		productionRequirement = 200;
		goldMaintenance = 0;
		techRequired = 52;
	}

	public void uniqueAbility() {
		
	}

	public boolean canBeBuilt() {
		if (location.getOwner().hasTechnology(techRequired) && location.getOwner().hasWonder(0))
			return true;
		return false;
	}

	public void removeAbility() {

	}
}
