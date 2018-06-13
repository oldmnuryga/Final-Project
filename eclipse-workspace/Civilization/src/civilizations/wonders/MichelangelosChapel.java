package civilizations.wonders;
//Class for wonder to be called to be added to a city
import civilizations.City;
import civilizations.Wonder;
import civilizations.buildings.Cathedral;

public class MichelangelosChapel extends Wonder {
	public MichelangelosChapel(City city) {
		wonderID = 7;
		location = city;
		owner = location.getOwner();
		name = "Michelangelo's Chapel";
		description = "Increases effect of Cathedrals";
		productionRequirement = 300;
		techRequired = 18;
		techObsoletionID = 28;
	}
	public MichelangelosChapel() {
		wonderID = 7;
		//owner = location.getOwner();
		name = "Michelangelo's Chapel";
		description = "Increases effect of Cathedrals";
		productionRequirement = 300;
		techRequired = 18;
		techObsoletionID = 28;
	}

	public void uniqueAbility() {
		if (location.hasBuilding(3)) {
			((Cathedral) location.getCertainBuilding(3))
					.setAddedHappiness((int) ((Cathedral) location.getCertainBuilding(3)).decideHappiness());
		}
	}

	public void obsoleteAbility() {
		if (location.hasBuilding(3)) {
			((Cathedral) location.getCertainBuilding(3))
					.setAddedHappiness((int) ((Cathedral) location.getCertainBuilding(3)).decideHappiness());
		}
	}

}
