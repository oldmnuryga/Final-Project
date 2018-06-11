package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Factory extends Building {
	private double addedProduction;

	public Factory(City city) {
		buildingID = 5;
		location = city;
		name = "Factory";
		description = "Production +50%. Becomes obsolete with a Mfg. plant.";
		productionRequirement = 200;
		goldMaintenance = 4;
		techRequired = 42;
		addedProduction = location.getProductionRate() * 0.5;
	}

	public Factory() {
		buildingID = 5;
		name = "Factory";
		description = "Production +50%. Becomes obsolete with a Mfg. plant.";
		productionRequirement = 200;
		goldMaintenance = 4;
		techRequired = 42;
		addedProduction = location.getProductionRate() * 0.5;
	}

	public double getAddedProduction() {
		return addedProduction;
	}

	public void setAddedProduction(double addedProduction) {
		this.addedProduction = addedProduction;
	}

	public void uniqueAbility() {
		location.setProductionRate(location.getProductionRate() + addedProduction);
	}

	public boolean canBeBuilt() {
		if (location.getOwner().hasTechnology(techRequired)) {
			if (location.hasBuilding(9))
				return false;
			return true;
		}
		return false;
	}

	public void removeAbility() {
		location.setProductionRate(location.getProductionRate() - addedProduction);
	}

}
