package civilizations.buildings;

import civilizations.City;

public class SpaceshipEngine extends SpaceshipPart {
	public SpaceshipEngine(City city) {
		buildingID = 16;
		spaceshipID = 1;
		location = city;
		name = "Spaceship Engine";
		description = "One of the three parts required for a science victory.";
		productionRequirement = 200;
		goldMaintenance = 0;
		techRequired = 57;
	}

	public SpaceshipEngine() {
		buildingID = 16;
		spaceshipID = 1;
		name = "Spaceship Engine";
		description = "One of the three parts required for a science victory.";
		productionRequirement = 200;
		goldMaintenance = 0;
		techRequired = 57;
	}
}
