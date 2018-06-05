package civilizations.wonders;

import civilizations.City;
import civilizations.Wonder;

public class BachsCathedral extends Wonder {
	private int addedHappiness;
	public BachsCathedral(City city) {
		wonderID = 1;
		location = city;
		owner = location.getOwner();
		name = "Bach's Cathedral";
		description = "+3 Happiness";
		productionRequirement = 400;
		techRequired = 34;
		techObsoletionID = -1;
		addedHappiness = 3;
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
		// TODO Auto-generated method stub
		
	}
	
	
}

