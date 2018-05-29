package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Granary extends Building {
	private double removedFoodCap;

	public Granary(City city) {
		location = city;
		name = "Granary";
		description = "Reduces food needed to grow population by 50%.";
		productionRequirement = 60;
		goldMaintenance = 1;
		techRequired = 3;
		goldSellPrice = 60;
		goldPurchaseCost = 240;
		removedFoodCap = location.getFoodCap() / 2.0;
		uniqueAbility();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getProductionRequirement() {
		return productionRequirement;
	}

	public void setProductionRequirement(double productionRequirement) {
		this.productionRequirement = productionRequirement;
	}

	public int getGoldMaintenance() {
		return goldMaintenance;
	}

	public void setGoldMaintenance(int goldMaintenance) {
		this.goldMaintenance = goldMaintenance;
	}

	public int getTechRequired() {
		return techRequired;
	}

	public void setTechRequired(int techRequired) {
		this.techRequired = techRequired;
	}

	public City getLocation() {
		return location;
	}

	public void setLocation(City location) {
		this.location = location;
	}

	public double getRemovedFoodCap() {
		return removedFoodCap;
	}

	public void setRemovedFoodCap(double removedFoodCap) {
		this.removedFoodCap = removedFoodCap;
	}

	public void uniqueAbility() {
		location.setFoodCap(location.getFoodCap() - removedFoodCap);
	}

}
