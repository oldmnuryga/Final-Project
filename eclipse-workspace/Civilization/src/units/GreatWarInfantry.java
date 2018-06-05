package units;

public class GreatWarInfantry extends Unit {

	public GreatWarInfantry() {
		super.hitpoints = 125;
		super.attackRating = 35;
		super.productionCost = 320;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 4;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Great War Infantry";
	}
}
