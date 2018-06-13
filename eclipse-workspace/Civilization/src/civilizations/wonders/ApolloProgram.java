package civilizations.wonders;
//Class for wonder to be called to be added to a city
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
	public ApolloProgram() {
		wonderID = 0;
	//	owner = location.getOwner();
		name = "Apollo Program";
		description = "Allows building of spaceship parts";
		productionRequirement = 600;
		techRequired = 57;
		techObsoletionID = -1;
	}

	public void uniqueAbility() {
		
		
	}

	public void obsoleteAbility() {
		
	}
}
