package units;

public class Marine extends Unit {

	public Marine() {
		super.hitpoints = 150;
		super.attackRating = 43;
		super.productionCost = 0;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
	}
}
