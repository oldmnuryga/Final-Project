package units;

public class Battleship extends Unit {

	public Battleship() {
		super.hitpoints = 140;
		super.attackRating = 70;
		super.productionCost = 375;
		super.location  = null;
		super.ranged = true;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 3;
		super.maintenance = 4;
		super.isAir = false;
	}
}