package civilizations.wonders;

import civilizations.City;
import civilizations.Wonder;

public class ApolloProgram extends Wonder {
	public ApolloProgram(City city) {
		wonderID = 0;
		location = city;
		owner = location.getOwner();
		name = "Apollo Program";
		description = "Allows building of spaceship parts";
		productionRequirement = 600;
		techRequired = 57;
		techObsoletionID = -1;
	}
}
