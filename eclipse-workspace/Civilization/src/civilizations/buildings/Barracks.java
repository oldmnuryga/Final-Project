package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Barracks extends Building {
	public Barracks(City city) {
		buildingID = 2;
		location = city;
		name = "Barracks";
		description = "All units have 10% more health.";
		productionRequirement = 40;
		goldMaintenance = 0;
		techRequired = -1;
	}

	public void uniqueAbility() {
		for (int j = 0; j < location.getOwner().get$units().size(); j++)
			location.getOwner().get$units().get(j)
					.setHitPoints((int) (location.getOwner().get$units().get(j).getHitPoints() * 1.1));
	}

	public void removeAbility() {
		for (int j = 0; j < location.getOwner().get$units().size(); j++)
			location.getOwner().get$units().get(j)
					.setHitPoints((int) (location.getOwner().get$units().get(j).getHitPoints() / 1.1));

	}

}
