package units;

public class Tank extends Unit {

	public Tank() {
		super.hitpoints = 100;
		super.defenseRating = 1;
		super.effectiveHitpoints = 100;
		super.attackRating = 7;
		super.productionCost = 0;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
	}
}
