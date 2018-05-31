package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class ManufacturingPlant extends Building {
	private double addedProduction;

	public ManufacturingPlant(City city) {
		buildingID = 9;
		location = city;
		name = "Manufacturing Plant";
		description = "Production +100%.";
		productionRequirement = 320;
		goldMaintenance = 6;
		techRequired = 61;
		addedProduction = location.getProductionRate();
		isBuilt = false;
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
}
