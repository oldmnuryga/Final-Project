package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Walls extends Building {
	private double addedDefense;

	public Walls(City city) {
		location = city;
		name = "City Walls";
		description = "City Defense +100%.";
		productionRequirement = 120;
		goldMaintenance = 2;
		techRequired = 5;
		goldSellPrice = 120;
		goldPurchaseCost = 480;
		addedDefense = location.getDefenseRating();
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

	public double getAddedDefense() {
		return addedDefense;
	}

	public void setAddedDefense(double addedDefense) {
		this.addedDefense = addedDefense;
	}

	public void uniqueAbility() {
		location.setDefenseRating(location.getDefenseRating() + addedDefense);
	}

}
