package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Colosseum extends Building {
	private int addedHappiness;

	public Colosseum(City city) {
		location = city;
		name = "Colosseum";
		description = "+3 Happiness.";
		productionRequirement = 100;
		goldMaintenance = 4;
		techRequired = 12;
		goldSellPrice = 100;
		goldPurchaseCost = 400;
		addedHappiness = 3;
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

	public int getAddedHappiness() {
		return addedHappiness;
	}

	public void setAddedHappiness(int addedHappiness) {
		this.addedHappiness = addedHappiness;
	}

	public void uniqueAbility() {
		location.getOwner().setHappiness(location.getOwner().getHappiness() + addedHappiness);
	}
}
