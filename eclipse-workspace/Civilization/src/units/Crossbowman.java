package units;

public class Crossbowman extends Unit {

	public Crossbowman() {
		super.hitpoints = 40;
		super.attackRating = 15;
		super.productionCost = 120;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 1;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Crossbowman";
	}
}
