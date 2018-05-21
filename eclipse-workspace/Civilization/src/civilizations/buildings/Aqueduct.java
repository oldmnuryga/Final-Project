package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Aqueduct extends Building{
	protected String name; 
	protected String description;
	protected double productionRequirement;
	protected int goldMaintenance;
	protected int techRequired;
	protected City location;
	public Aqueduct (City city) {
		name = "Aqueduct";
		description = "Allows City to Grow over 10.";
		productionRequirement = 120;
		goldMaintenance = 2;
		techRequired = 12;
		city.setCitizenCap(30);
	}
}
