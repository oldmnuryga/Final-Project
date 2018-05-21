package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Barracks extends Building{
	protected String name; 
	protected String description;
	protected double productionRequirement;
	protected int goldMaintenance;
	protected int techRequired;
	protected City location;
	public Barracks (City city) {
		name = "Barracks";
		description = "All units have 10% more health.";
		productionRequirement = 40;
		goldMaintenance = 0;
		techRequired = -1;
		for (int j = 0; j < city.getOwner().get$units().size(); j++)
			city.getOwner().get$units().get(j).setHitPoints((int) (city.getOwner().get$units().get(j).getHitPoints()*1.1));
	}
}


