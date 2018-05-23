package units;

public class Archer extends Unit {

	public Archer() {
		super.hitpoints = 30;
		super.attackRating = 7;
		super.productionCost = 40;
		super.location  = null;
		super.ranged = true;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
	}
}
