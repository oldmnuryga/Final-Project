package units;

public class Pikeman extends Unit {

	public Pikeman() {
		super.hitpoints = 40;
		super.attackRating = 16;
		super.productionCost = 90;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
	}
}
