package civilizations;

public abstract class Wonder extends Structure {
	protected Player owner = location.getOwner();
	protected boolean isWorldWonder;
	protected int wonderID;
	protected int techObsoletionID;
	protected boolean isObsolete = false;

	public boolean canBeBuilt() {
		if (owner.hasTechnology(techRequired)) {
			if (isWorldWonder) { // TODO -- CHECK IF OTHER PLAYER HAS IT

			}
		}
		return false;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public boolean isWorldWonder() {
		return isWorldWonder;
	}

	public void setWorldWonder(boolean isWorldWonder) {
		this.isWorldWonder = isWorldWonder;
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
}
