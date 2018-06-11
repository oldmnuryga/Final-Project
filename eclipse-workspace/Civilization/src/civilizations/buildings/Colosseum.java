package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Colosseum extends Building {
	private int addedHappiness;

	public Colosseum(City city) {
		buildingID = 4;
		location = city;
		name = "Colosseum";
		description = "+3 Happiness.";
		productionRequirement = 100;
		goldMaintenance = 4;
		techRequired = 12;
		addedHappiness = 3;
	}

	public Colosseum() {
		buildingID = 4;
		name = "Colosseum";
		description = "+3 Happiness.";
		productionRequirement = 100;
		goldMaintenance = 4;
		techRequired = 12;
		addedHappiness = 3;
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
}
