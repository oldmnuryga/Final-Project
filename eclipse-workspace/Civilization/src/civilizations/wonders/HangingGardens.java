package civilizations.wonders;
//Class for wonder to be called to be added to a city
import civilizations.City;
import civilizations.Wonder;

public class HangingGardens extends Wonder {
	private int addedHappiness;

	public HangingGardens(City city) {
		wonderID = 6;
		location = city;
		owner = location.getOwner();
		name = "Hanging Gardens";
		description = "+1 Happiness Per Existing City.";
		productionRequirement = 300;
		techRequired = 3;
		techObsoletionID = 30;
		addedHappiness = owner.get$cities().size();
	}
	public HangingGardens() {
		wonderID = 6;
		//owner = location.getOwner();
		name = "Hanging Gardens";
		description = "+1 Happiness Per Existing City.";
		productionRequirement = 300;
		techRequired = 3;
		techObsoletionID = 30;
		//addedHappiness = owner.get$cities().size();
	}

	public void uniqueAbility() {
		owner.setHappiness(owner.getHappiness() + addedHappiness);
	}

	public void obsoleteAbility() {
		owner.setHappiness(owner.getHappiness() - addedHappiness);
	}

}
