package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Granary extends Building {
	private double newFoodCap;
	private double oldFoodCap;

	public Granary(City city) {
		buildingID = 6;
		location = city;
		name = "Granary";
		description = "Reduces food needed to grow population by 50%.";
		productionRequirement = 60;
		goldMaintenance = 1;
		techRequired = 3;
		oldFoodCap = location.getFoodCap();
		newFoodCap = oldFoodCap / 2.0;
	}

	public double getNewFoodCap() {
		return newFoodCap;
	}

	public void setNewFoodCap(double removedFoodCap) {
		this.newFoodCap = removedFoodCap;
	}

	public double getOldFoodCap() {
		return oldFoodCap;
	}

	public void setOldFoodCap(double oldFoodCap) {
		this.oldFoodCap = oldFoodCap;
	}

	public void uniqueAbility() {
		location.setFoodCap(newFoodCap);
	}

	public void removeAbility() {
		location.setFoodCap(oldFoodCap);

	}

}
