package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Granary extends Building {
	private double newFoodCap;

	public Granary(City city) {
		buildingID = 6;
		location = city;
		name = "Granary";
		description = "Reduces food needed to grow population by 50%.";
		productionRequirement = 60;
		goldMaintenance = 1;
		techRequired = 3;
		newFoodCap = location.getFoodCap() / 2.0;
		isBuilt = false;
	}

	public double getNewFoodCap() {
		return newFoodCap;
	}

	public void setNewFoodCap(double removedFoodCap) {
		this.newFoodCap = removedFoodCap;
	}

	public void uniqueAbility() {
		location.setFoodCap(location.getFoodCap() - newFoodCap);
	}

}
