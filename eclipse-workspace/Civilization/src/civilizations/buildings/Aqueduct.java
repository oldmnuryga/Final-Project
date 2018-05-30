package civilizations.buildings;

import civilizations.Building;
import civilizations.City;
import civilizations.Structure;

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
		isBuilt = false;
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
