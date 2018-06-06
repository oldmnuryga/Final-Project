package civilizations.buildings;

import civilizations.City;

public class SpaceshipCockpit extends SpaceshipPart {
	public SpaceshipCockpit(City city) {
		buildingID = 15;
		spaceshipID = 0;
		location = city;
		name = "Spaceship Cockpit";
		description = "One of the three parts required for a science victory.";
		productionRequirement = 200;
		goldMaintenance = 0;
		techRequired = 52;
	}
}
