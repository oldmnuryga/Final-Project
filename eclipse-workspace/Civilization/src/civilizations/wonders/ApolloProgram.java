package civilizations.wonders;

import civilizations.City;
import civilizations.Wonder;

public class ApolloProgram extends Wonder {
	public ApolloProgram(City city) {
		wonderID = 0;
		location = city;
		name = "Apollo Program";
		description = "Allows construction of spaceship parts.";
		productionRequirement = 120;
		techRequired = 12;
		isWorldWonder = false;
	}
}
