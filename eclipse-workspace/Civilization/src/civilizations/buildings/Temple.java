package civilizations.buildings;

import java.security.acl.Owner;

import civilizations.Building;
import civilizations.City;

public class Temple extends Building {
	private double addedHappiness;
	public Temple(City city) {
		location = city;
		name = "Nuclear Plant.";
		description = "Production +50%.";
		productionRequirement = 160;
		goldMaintenance = 2;
		techRequired = 65;
		goldSellPrice = 160;
		goldPurchaseCost = 640;
		addedHappiness = decideHappiness();
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

	public double getAddedHappiness() {
		return addedHappiness;
	}

	public void setAddedHappiness(double addedHappiness) {
		this.addedHappiness= addedHappiness;
	}
	public double decideHappiness() {
		//TODO
		return 1.0;
	}

	@Override
	public void uniqueAbility() {
		location.getOwner().setHappiness(location.getOwner().getHappiness() + addedHappiness);
	}
}

