package units;

public class Legion extends Unit {

	public Legion() {
		super.hitpoints = 40;
		super.attackRating = 17;
		super.productionCost = 75;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
	}
}
