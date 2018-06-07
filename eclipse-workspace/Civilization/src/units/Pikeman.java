package units;

public class Pikeman extends Unit {

	public Pikeman() {
		super.unitID = 15;
		super.hitpoints = 40;
		super.attackRating = 16;
		super.productionCost = 90;
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
		super.unitName = "Pikeman";
	}
}
