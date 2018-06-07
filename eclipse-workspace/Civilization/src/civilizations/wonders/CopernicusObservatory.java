package civilizations.wonders;

import civilizations.City;
import civilizations.Wonder;

public class CopernicusObservatory extends Wonder {
	public int addedScience;

	public CopernicusObservatory(City city) {
		wonderID = 3;
		location = city;
		owner = location.getOwner();
		name = "Copernicus' Observatory";
		description = "Doubles Science output.";
		productionRequirement = 300;
		techRequired = 15;
		techObsoletionID = 56;
	}

	public int getAddedScience() {
		return addedScience;
	}

	public void setAddedScience(int addedScience) {
		this.addedScience = addedScience;
	}

	public void uniqueAbility() {
		owner.setSciencePerTurn(owner.getSciencePerTurn() + addedScience);
	}

	public void obsoleteAbility() {
		owner.setSciencePerTurn(owner.getSciencePerTurn() - addedScience);
	}

}
