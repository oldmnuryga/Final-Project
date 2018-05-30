package units;

import java.lang.reflect.Method;

import map.Tile;
import technology.Technology;

public abstract class Unit {
	protected int hitpoints;
	protected int attackRating;
	protected int productionCost;
	protected Tile location;
	protected boolean ranged;
	protected boolean alive;
	protected boolean fortified;
	protected boolean isAir;
	protected boolean isNaval;
	protected boolean isGround;
	protected int maxMovement;
	protected int maintenance;
	protected Technology requiredTech;
	protected int buyCost;
	
	public Technology getRequiredTech() {
		return requiredTech;
	}
	public void setRequiredTech(Technology requiredTech) {
		this.requiredTech = requiredTech;
	}
	public boolean isAir() {
		return isAir;
	}
	public void setAir(boolean isAir) {
		this.isAir = isAir;
	}
	public boolean isNaval() {
		return isNaval;
	}
	public void setNaval(boolean isNaval) {
		this.isNaval = isNaval;
	}
	public boolean isGround() {
		return isGround;
	}
	public void setGround(boolean isGround) {
		this.isGround = isGround;
	}
	public int getBuyCost() {
		return buyCost;
	}
	public void setBuyCost(int buyCost) {
		this.buyCost = buyCost;
	}
	public int getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(int maintenance) {
		this.maintenance = maintenance;
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
	public int getAttackRating() {
		return attackRating;
	}
	public int getProdCost() {
		return productionCost;
	}
	public void setHitPoints(int hit) {
		this.hitpoints = hit;
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
