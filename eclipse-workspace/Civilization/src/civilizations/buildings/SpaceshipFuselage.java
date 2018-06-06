package civilizations.buildings;

import civilizations.City;

public class SpaceshipFuselage extends SpaceshipPart {
	public SpaceshipFuselage(City city) {
		buildingID = 17;
		spaceshipID = 2;
		location = city;
		name = "Spaceship Fuselage";
		description = "One of the three parts required for a science victory.";
		productionRequirement = 200;
		goldMaintenance = 0;
		techRequired = 58;
	}
}
