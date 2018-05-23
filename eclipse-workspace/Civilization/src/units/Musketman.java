package units;

public class Musketman extends Unit {

	public Musketman() {
		super.hitpoints = 110;
		super.attackRating = 27;
		super.productionCost = 0;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
	}
}
