package units;

public class Cannon extends Unit {

	public Cannon() {
		super.hitpoints = 70;
		super.attackRating = 14;
		super.productionCost = 0;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
	}
}
