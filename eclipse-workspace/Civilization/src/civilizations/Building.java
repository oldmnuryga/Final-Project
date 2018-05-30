package civilizations;

public abstract class Building extends Structure {
	protected int goldMaintenance;
	protected int goldPurchaseCost;
	protected int goldSellPrice;
	public abstract void uniqueAbility();
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
	

}
