package units;

public class Catapult extends Unit {

	public Catapult() {
		super.hitpoints = 50;
		super.attackRating = 20;
		super.productionCost = 0;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
	}
}
