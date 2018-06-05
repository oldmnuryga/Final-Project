package civilizations;

public abstract class Wonder extends Structure {
	protected Player owner;
	protected int wonderID;
	protected int techObsoletionID;
	protected boolean isObsolete = false;

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

	public abstract void uniqueAbility();

	public abstract void obsoleteAbility();
}
