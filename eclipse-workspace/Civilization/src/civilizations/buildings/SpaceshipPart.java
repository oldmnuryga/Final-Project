package civilizations.buildings;

import civilizations.Building;

public abstract class SpaceshipPart extends Building {
	protected int spaceshipID;
	
	//used for the science victory

	public int getSpaceshipID() {
		return spaceshipID;
	}

	public void setSpaceshipID(int spaceshipID) {
		this.spaceshipID = spaceshipID;
	}

	public boolean canBeBuilt() {
		if (location.getOwner().hasTechnology(techRequired) && location.hasWonder(0))
			return true;
		return false;
	}

	public void uniqueAbility() {

	}

	public void removeAbility() {

	}

}
