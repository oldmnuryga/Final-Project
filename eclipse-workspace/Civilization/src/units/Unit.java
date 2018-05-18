package units;

public abstract class Unit {
	protected int hitpoints;
	protected int defenseRating;
	protected int attackRating;
	protected int productionCost;
	protected int unitRLoc;
	protected int unitCLoc;
	protected boolean alive;
	
	public int getHitPoints() {
		return hitpoints;
	}
	public int getDefenseRating() {
		return defenseRating;
	}
	public int getAttackRating() {
		return attackRating;
	}
	public int getProdCost() {
		return productionCost;
	}
	public void setHitPoints(int hit) {
		this.hitpoints = hit;
	}
	public void setDefenseRating(int def) {
		this.defenseRating = def;
	}
	public void setAttackRating(int att) {
		this.attackRating = att;
	}
	public void setProdCost(int prod) {
		this.productionCost = prod;
	}
	public int getUnitRowLocation() {
		return unitRLoc;
	}
	public int getUnitColLocation() {
		return unitCLoc;
	}
	public void setUnitRowLocation(int row) {
		this.unitRLoc = row;
	}
	public void setUnitColLocation(int col) {
		this.unitCLoc = col;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean a) {
		this.alive = a;
	}
}
