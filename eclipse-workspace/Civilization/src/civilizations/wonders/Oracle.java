package civilizations.wonders;

import civilizations.City;
import civilizations.Wonder;
import civilizations.buildings.Temple;

public class Oracle extends Wonder {
	protected int addedHappiness;

	public Oracle(City city) {
		wonderID = 15;
		location = city;
		owner = location.getOwner();
		name = "Oracle";
		description = "Doubles effect of Temples.";
		productionRequirement = 300;
		techRequired = 8;
		techObsoletionID = 34;
		isWorldWonder = true;
		addedHappiness = decideHappiness();
	}

	public int decideHappiness() {
		double happy = 0.0;
		for (int i = 0; i < owner.get$cities().size(); i++) {
			if (owner.get$cities().get(i).hasBuilding(12)) {

			}
		}

	}
}
