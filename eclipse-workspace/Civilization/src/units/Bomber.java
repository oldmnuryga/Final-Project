package units;

public class Bomber extends Unit {

	public Bomber() {
		super.hitpoints = 130;
		super.attackRating = 75;
		super.productionCost = 375;
		super.location = null;
		super.ranged = true;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 4;
		super.maintenance = 4;
		super.isAir = true;
		super.isGround = false;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Bomber";
	}
}