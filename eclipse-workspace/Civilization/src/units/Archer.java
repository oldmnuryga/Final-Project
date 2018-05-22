package units;

public class Archer extends Unit {

	public Archer() {
		super.hitpoints = 100;
		super.defenseRating = 4;
		super.effectiveHitpoints = 100;
		super.attackRating = 7;
		super.productionCost = 40;
		super.location  = null;
		super.ranged = true;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
	}
}
