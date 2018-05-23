package units;

public class Rifleman extends Unit {

	public Rifleman() {
		super.hitpoints = 90;
		super.attackRating = 30;
		super.productionCost = 225;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
	}
}
