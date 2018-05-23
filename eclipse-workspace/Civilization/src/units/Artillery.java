package units;

public class Artillery extends Unit {

	public Artillery() {
		super.hitpoints = 95;
		super.attackRating = 25;
		super.productionCost = 375;
		super.location  = null;
		super.ranged = true;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
	}
}
