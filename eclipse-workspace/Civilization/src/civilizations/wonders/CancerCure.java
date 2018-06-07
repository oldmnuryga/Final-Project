package civilizations.wonders;

import civilizations.City;
import civilizations.Wonder;

public class CancerCure extends Wonder {
	private int addedHappiness;

	public CancerCure(City city) {
		wonderID = 2;
		location = city;
		owner = location.getOwner();
		name = "The Cure for Cancer";
		description = "+1 Happiness per Existing City";
		productionRequirement = 600;
		techRequired = 54;
		techObsoletionID = -1;
		addedHappiness = getOwner().get$cities().size();
	}

	public int getAddedHappiness() {
		return addedHappiness;
	}

	public void setAddedHappiness(int addedHappiness) {
		this.addedHappiness = addedHappiness;
	}

	public void uniqueAbility() {
		owner.setHappiness(owner.getHappiness() + addedHappiness);
	}

	public void obsoleteAbility() {

	}
}
