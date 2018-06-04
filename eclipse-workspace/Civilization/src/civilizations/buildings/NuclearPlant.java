package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class NuclearPlant extends Building {
	private double addedProduction;

	public NuclearPlant(City city) {
		buildingID = 11;
		location = city;
		name = "Nuclear Plant.";
		description = "Production +50%.";
		productionRequirement = 160;
		goldMaintenance = 2;
		techRequired = 65;
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

	public void removeAbility() {
		location.setProductionRate(location.getProductionRate() - addedProduction);
	}
}
