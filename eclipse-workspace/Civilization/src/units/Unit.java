package units;

import map.Tile;

public abstract class Unit {
	protected int hitpoints;
	protected int effectiveHitpoints;
	protected int defenseRating;
	protected int attackRating;
	protected int productionCost;
	protected Tile location;
	protected boolean ranged;
	protected boolean alive;
	protected boolean fortified;
	protected int maxMovement;
	
	public int getEffectiveHitpoints() {
		return effectiveHitpoints;
	}
	public void setEffectiveHitpoints(int effectiveHitpoints) {
		this.effectiveHitpoints = effectiveHitpoints;
	}
	public boolean isRanged() {
		return ranged;
	}
	public void setRanged(boolean ranged) {
		this.ranged = ranged;
	}
	public boolean isFortified() {
		return fortified;
	}
	public void setFortified(boolean fortified) {
		this.fortified = fortified;
	}
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
	public int getHitpoints() {
		return hitpoints;
	}
	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}
	public int getProductionCost() {
		return productionCost;
	}
	public void setProductionCost(int productionCost) {
		this.productionCost = productionCost;
	}
	public Tile getLocation() {
		return location;
	}
	public void setLocation(Tile location) {
		this.location = location;
	}
	public int getMaxMovement() {
		return maxMovement;
	}
	public void setMaxMovement(int maxMovement) {
		this.maxMovement = maxMovement;
	}
	public boolean isAlive() {
		return alive;
	} 
	public void setAlive(boolean a) {
		this.alive = a;
	}
	public int getMovement() {
		return maxMovement;
	}
}
