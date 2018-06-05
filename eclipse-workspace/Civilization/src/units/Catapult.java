package units;

public class Catapult extends Unit {

	public Catapult() {
		super.hitpoints = 50;
		super.attackRating = 20;
		super.productionCost = 75;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 1;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Catapult";
	}
}
