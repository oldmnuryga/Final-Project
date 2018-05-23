package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Walls extends Building{
	protected String name; 
	protected String description;
	protected double productionRequirement;
	protected int goldMaintenance;
	protected int techRequired;
	protected City location;
	public Walls (City city) {
		name = "Walls";
		description = "3X Defense Bonus and no population loss if attacked.";
		productionRequirement = 120;
		goldMaintenance = 2;
		techRequired = 5;
		//TO-DO
		//CODE IN SPECIAL ABILITY OF WALLS
	}
}




