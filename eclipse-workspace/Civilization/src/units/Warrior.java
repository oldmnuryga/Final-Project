package units;

public class Warrior extends Unit {

	public Warrior() {
		super.hitpoints = 30;
		super.attackRating = 8;
		super.productionCost = 40;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 1;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
	}
}
