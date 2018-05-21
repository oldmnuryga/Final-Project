package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Bank extends Building{
	protected String name; 
	protected String description;
	protected double productionRequirement;
	protected int goldMaintenance;
	protected int techRequired;
	protected City location;
	public Bank (City city) {
		name = "Bank";
		description = "Taxes and Luxuries increase by 50%.";
		productionRequirement = 120;
		goldMaintenance = 3;
		techRequired = 26;
		city.setGoldRate(city.getGoldRate()*1.5);
	}
}

