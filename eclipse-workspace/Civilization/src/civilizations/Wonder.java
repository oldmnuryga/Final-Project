package civilizations;

import java.util.ArrayList;

import civilizations.wonders.ApolloProgram;
import civilizations.wonders.BachsCathedral;
import civilizations.wonders.CancerCure;
import civilizations.wonders.CopernicusObservatory;
import civilizations.wonders.DarwinsVoyage;
import civilizations.wonders.GreatLibrary;
import civilizations.wonders.HangingGardens;
import civilizations.wonders.MichelangelosChapel;
import civilizations.wonders.NewtonsCollege;
import civilizations.wonders.Oracle;

public abstract class Wonder extends Structure {
	protected Player owner;
	protected int wonderID;
	protected int techObsoletionID;
	protected boolean isObsolete = false;

	public static ArrayList<Wonder> $allWonders = new ArrayList<Wonder>();

	public boolean canBeBuilt() {
		if (owner.hasTechnology(techRequired) && !(owner.hasTechnology(techObsoletionID)))
			return true;
		return false;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public int getWonderID() {
		return wonderID;
	}

	public void setWonderID(int wonderID) {
		this.wonderID = wonderID;
	}

	public int getTechObsoletionID() {
		return techObsoletionID;
	}

	public void setTechObsoletionID(int techObsoletionID) {
		this.techObsoletionID = techObsoletionID;
	}

	public boolean isObsolete() {
		return isObsolete;
	}

	public void setObsolete(boolean isObsolete) {
		this.isObsolete = isObsolete;
	}

	public boolean checkObsolete() {
		if (owner.hasTechnology(techObsoletionID)) {
			return true;

		}
		return false;
	}

	public static void instantiateWonderArrayList() {
		$allWonders.add(new ApolloProgram());
		$allWonders.add(new BachsCathedral());
		$allWonders.add(new CancerCure());
		$allWonders.add(new CopernicusObservatory());
		$allWonders.add(new DarwinsVoyage());
		$allWonders.add(new GreatLibrary());
		$allWonders.add(new HangingGardens());
		$allWonders.add(new MichelangelosChapel());
		$allWonders.add(new NewtonsCollege());
		$allWonders.add(new Oracle());
	}

	public abstract void uniqueAbility();

	public abstract void obsoleteAbility();
}
