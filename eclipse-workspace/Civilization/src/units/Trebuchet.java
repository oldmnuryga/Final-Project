package units;

public class Trebuchet extends Unit {

	public Trebuchet() {
		super.unitID = 22;
		super.hitpoints = 80;
		super.attackRating = 23;
		super.productionCost = 120;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 2;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Trebuchet";
	}
}
