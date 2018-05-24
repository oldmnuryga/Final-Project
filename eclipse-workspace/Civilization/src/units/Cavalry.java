package units;

public class Cavalry extends Unit {

	public Cavalry() {
		super.hitpoints = 45;
		super.attackRating = 25;
		super.productionCost = 225;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 1;
	}
}
