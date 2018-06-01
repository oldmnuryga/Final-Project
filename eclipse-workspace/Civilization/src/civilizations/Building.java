package civilizations;

public abstract class Building extends Structure {
	protected int goldMaintenance;
	protected int goldSellPrice = productionRequirement;
	protected int goldPurchaseCost = productionRequirement * 3;
	protected int buildingID;

	public abstract void uniqueAbility();

	public abstract void removeAbility();

	public int getGoldMaintenance() {
		return goldMaintenance;
	}

	public void setGoldMaintenance(int goldMaintenance) {
		this.goldMaintenance = goldMaintenance;
	}

	public int getGoldPurchaseCost() {
		return goldPurchaseCost;
	}

	public void setGoldPurchaseCost(int goldPurchaseCost) {
		this.goldPurchaseCost = goldPurchaseCost;
	}

	public int getGoldSellPrice() {
		return goldSellPrice;
	}

	public void setGoldSellPrice(int goldSellPrice) {
		this.goldSellPrice = goldSellPrice;
	}

	public int getBuildingID() {
		return buildingID;
	}

	public void setBuildingID(int buildingID) {
		this.buildingID = buildingID;
	}

	public boolean canBeBuilt() {
		if (techRequired < 0 || location.getOwner().hasTechnology(techRequired))
			return true;
		return false;
	}

}
