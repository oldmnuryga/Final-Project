package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class HydroPlant extends Building {
	private double addedProduction;

	public HydroPlant(City city) {
		buildingID = 7;
		location = city;
		name = "Hydro Plant";
		description = "Production +50%. Must be built in a coastal city.";
		productionRequirement = 240;
		goldMaintenance = 4;
		techRequired = 45;
		addedProduction = location.getProductionRate() * 0.5;
	}

	public HydroPlant() {
		buildingID = 7;
		name = "Hydro Plant";
		description = "Production +50%. Must be built in a coastal city.";
		productionRequirement = 240;
		goldMaintenance = 4;
		techRequired = 45;
	//	addedProduction = location.getProductionRate() * 0.5;
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
