package civilizations.buildings;
//ABSTRACT CLASS FOR SPACESHIP PART -- SETS UP THREE DIFFERENT SPACESHIP PARTS TO MAKE IT EASIER TO CREATE
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
	//CHECKS IF SPACESHIP PARTS CAN BE BUILT
	public boolean canBeBuilt() {
		if (location.getOwner().hasTechnology(techRequired) && location.hasWonder(0))
			return true;
		return false;
	}
	//HAS NO ABILITY BECAUSE IS USED SOLELY FOR SCIENCE VICTORY -- NO BONUS TO CITIES OR THE PLAYER
	public void uniqueAbility() {

	}

	public void removeAbility() {

	}

}
