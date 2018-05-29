package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Barracks extends Building {
	public Barracks(City city) {
		location = city;
		name = "Barracks";
		description = "All units have 10% more health.";
		productionRequirement = 40;
		goldMaintenance = 0;
		techRequired = -1;
		goldSellPrice = 40;
		goldPurchaseCost = 160;
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

	public void uniqueAbility() {
		for (int j = 0; j < location.getOwner().get$units().size(); j++)
			location.getOwner().get$units().get(j)
					.setHitPoints((int) (location.getOwner().get$units().get(j).getHitPoints() * 1.1));
	}

}
