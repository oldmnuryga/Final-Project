package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Walls extends Building {
	private double addedDefense;

	public Walls(City city) {
		buildingID = 14;
		location = city;
		name = "City Walls";
		description = "City Defense +100%.";
		productionRequirement = 120;
		goldMaintenance = 2;
		techRequired = 5;
		addedDefense = location.getDefenseRating();
	}

	public Walls() {
		buildingID = 14;
		name = "City Walls";
		description = "City Defense +100%.";
		productionRequirement = 120;
		goldMaintenance = 2;
		techRequired = 5;
		addedDefense = location.getDefenseRating();
	}

	public double getAddedDefense() {
		return addedDefense;
	}

	public void setAddedDefense(double addedDefense) {
		this.addedDefense = addedDefense;
	}

	public void uniqueAbility() {
		location.setDefenseRating(location.getDefenseRating() + addedDefense);
	}

	public void removeAbility() {
		location.setDefenseRating(location.getDefenseRating() - addedDefense);
	}

}
