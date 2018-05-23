package units;

public class Artillery extends Unit {

	public Artillery() {
		super.hitpoints = 100;
		super.attackRating = 7;
		super.productionCost = 375;
		super.location  = null;
		super.ranged = true;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
	}
}
