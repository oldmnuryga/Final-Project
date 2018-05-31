package units;

public class Swordsman extends Unit {

	public Swordsman() {
		super.hitpoints = 50;
		super.attackRating = 19;
		super.productionCost = 75;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 2;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Swordsman";
	}
}
