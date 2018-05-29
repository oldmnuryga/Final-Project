package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Aqueduct extends Building {
	private int newCitizenCap;
	private int oldCitizenCap;

	public Aqueduct(City city) {
		location = city;
		name = "Aqueduct";
		description = "Allows City to Grow over 10.";
		productionRequirement = 120;
		goldMaintenance = 2;
		techRequired = 12;
		goldSellPrice = 120;
		goldPurchaseCost = 480;
		newCitizenCap = 30;
		oldCitizenCap = 10;
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

	public int getNewCitizenCap() {
		return newCitizenCap;
	}

	public void setNewCitizenCap(int newCitizenCap) {
		this.newCitizenCap = newCitizenCap;
	}

	public int getOldCitizenCap() {
		return oldCitizenCap;
	}

	public void setOldCitizenCap(int oldCitizenCap) {
		this.oldCitizenCap = oldCitizenCap;
	}

	public void uniqueAbility() {
		location.setCitizenCap(newCitizenCap);
	}
}
