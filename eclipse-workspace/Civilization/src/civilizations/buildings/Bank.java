package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Bank extends Building {
	private double addedGold;

	public Bank(City city) {
		location = city;
		name = "Bank";
		description = "Taxes and Luxuries increase by 50%. Requires a market.";
		productionRequirement = 120;
		goldMaintenance = 3;
		techRequired = 26;
		goldSellPrice = 120;
		goldPurchaseCost = 480;
		addedGold = location.getGoldRate() * 0.5;
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

	public double getAddedGold() {
		return addedGold;
	}

	public void setAddedGold(double addedGold) {
		this.addedGold = addedGold;
	}

	public void uniqueAbility() {
		location.setGoldRate(location.getGoldRate() + addedGold);
	}
}
