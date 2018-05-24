package units;

public class Knight extends Unit {

	public Knight() {
		super.hitpoints = 55;
		super.attackRating = 20;
		super.productionCost = 120;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 4;
		super.maintenance = 2;
	}
}
