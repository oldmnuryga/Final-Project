package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class NuclearPlant extends Building {
	private double addedProduction;

	public NuclearPlant(City city) {
		location = city;
		name = "Nuclear Plant.";
		description = "Production +50%.";
		productionRequirement = 160;
		goldMaintenance = 2;
		techRequired = 65;
		goldSellPrice = 160;
		goldPurchaseCost = 640;
		addedProduction = location.getProductionRate() * 0.5;
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

	public double getAddedProduction() {
		return addedProduction;
	}

	public void setAddedProduction(double addedProduction) {
		this.addedProduction = addedProduction;
	}

	@Override
	public void uniqueAbility() {
		location.setProductionRate(location.getProductionRate() + addedProduction);
	}
}
