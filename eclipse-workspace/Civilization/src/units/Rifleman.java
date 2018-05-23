package units;

public class Rifleman extends Unit {

	public Rifleman() {
		super.hitpoints = 90;
		super.attackRating = 7;
		super.productionCost = 0;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
	}
}
