package civilizations.wonders;

import civilizations.City;
import civilizations.Wonder;
import civilizations.buildings.Library;
import civilizations.buildings.University;

public class NewtonsCollege extends Wonder {
	public NewtonsCollege(City city) {
		wonderID = 8;
		location = city;
		owner = location.getOwner();
		name = "Newton's College";
		description = "Increases effect of libraries and universities by 66%.";
		productionRequirement = 400;
		techRequired = 36;
		techObsoletionID = 63;
	}

	public void uniqueAbility() {
		if (location.hasBuilding(8)) {
			((Library) location.getCertainBuilding(8))
					.setAddedScience(((Library) location.getCertainBuilding(8)).decideScienceRate());
		}
		if (location.hasBuilding(13)) {
			((University) location.getCertainBuilding(13))
					.setAddedScience(((University) location.getCertainBuilding(8)).decideScienceRate());
		}
	}

	public void obsoleteAbility() {
		if (location.hasBuilding(8)) {
			((Library) location.getCertainBuilding(8))
					.setAddedScience(((Library) location.getCertainBuilding(8)).decideScienceRate());
		}
		if (location.hasBuilding(13)) {
			((University) location.getCertainBuilding(13))
					.setAddedScience(((University) location.getCertainBuilding(8)).decideScienceRate());
		}
	}

}
