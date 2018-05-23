package units;

public class Trebuchet extends Unit {

	public Trebuchet() {
		super.hitpoints = 80;
		super.attackRating = 23;
		super.productionCost = 120;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
	}
}
